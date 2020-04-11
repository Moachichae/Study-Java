package edu.java.jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class JDBCMain04 {
	// 1. DB�� ���� �����   //���� !
	public static final String URL = 
						"jdbc:oracle:thin:@localhost:1521:orcl"; // ������ ����Ŭ DB ��� ..??
	public static final String USER = "scott";
	public static final String PASSWORD = "tiger";
	
	public static final String TABLE_NAME = "ex_contact";
	public static final String COL_CID = "cid";
	public static final String COL_NAME = "name";
	public static final String COL_PHONE = "phone";
	public static final String COL_EMAIL = "email";	
	
	// developer�� �� ���� �̸� �ۼ�
	// insert ex_contact 
	// values (contact_pk.nextval, ?, ?, ?)
	public static final String SQL_INSERT = 
		"insert into " + TABLE_NAME + " values (contact_pk.nextval, ?, ?, ?)";	
	// delete : cid ��ȣ�� �˻��ؼ� ������ ����
	// delete form ex_contact where cid = ?
	public static final String SQL_DELETE = 
			"delete from " + TABLE_NAME + " where " + COL_CID + " = ?";
				
	// select : cid ��ȣ�� �˻��ؼ� ������ ����
	// select * from ex_contact where cid = ?
				public static final String SQL_SELECT_BY_CID =
						"select * from " + TABLE_NAME + " where " + COL_CID + " = ?";
	// update ex_contact
	// set name = ?, phone = ?, email = ?
	// where cid = ?
	public static final String SQL_UPDATE =
			"update " + TABLE_NAME
			+ " set " + COL_NAME + " = ?, " 
			+ COL_PHONE  + " = ?, "
			+ COL_EMAIL + " = ?"
			+ " where "+ COL_CID + " = ?";	
	
	public static void main(String[] args) {
		// Ű���� �Է� �غ�
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 2. JDBC ����̹��� ���(�޸𸮿� �ε�)
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("����̹� ��� ����");
			
			// 3. DB ����(Connection)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB ���� ����");
			
			// 4. PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(SQL_UPDATE);
			
			// �����͸� �Է�
			System.out.println("������ �ε��� �Է�>");
			int cid = sc.nextInt();
			sc.nextLine(); // ���� �ڿ� �Էµ� ���͸� ����
			
			System.out.println("������ �̸� �Է�>");
			String name = sc.nextLine();
			
			System.out.println("������ ��ȭ��ȣ �Է�>");
			String phone = sc.nextLine();
			
			System.out.println("������ �̸��� �Է�>");
			String email = sc.nextLine();
			
			// 5. SQL ������ �ϼ� - SQL_UPDATE�� ?�� ä���ִ� �ڵ�  �ڡ�
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, email);
			pstmt.setInt(4, cid);
			
			// 6. SQL ���� ����(DB ������ ����)
			int result = pstmt.executeUpdate();
			
			// 7. ��� Ȯ��
			System.out.println(result + "���� �����Ǿ����ϴ�.");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
				sc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	} // end main()

} // end JDBCMain04















