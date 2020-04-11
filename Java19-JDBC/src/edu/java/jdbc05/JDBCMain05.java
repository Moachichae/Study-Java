package edu.java.jdbc05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class JDBCMain05 {
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
	
			// delete : cid ��ȣ�� �˻��ؼ� ������ ����
			// delete form ex_contact where cid = ?
			public static final String SQL_DELETE = 
					"delete from " + TABLE_NAME + " where " + COL_CID + " = ?";
			
			// select : cid ��ȣ�� �˻��ؼ� ������ ����
			// select * from ex_contact where cid = ?
			public static final String SQL_SELECT_BY_CID =
					"select * from " + TABLE_NAME + " where " + COL_CID + " = ?";
	
	
	public static void main(String[] args) {
		// Ű���� �Է� �غ�
				Scanner sc = new Scanner(System.in);
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null; // import ����Ȯ��
				try {
					// 2. JDBC ����̹��� ���(�޸𸮿� �ε�)
					DriverManager.registerDriver(new OracleDriver());
					System.out.println("����̹� ��� ����");
					
					// 3. DB ����(Connection)
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
					System.out.println("DB ���� ����");
					
					// 4. PreparedStatement ��ü ����
					pstmt = conn.prepareStatement(SQL_SELECT_BY_CID);
					
					// �����͸� �Է�
					System.out.println("�˻��� �ε��� �Է�>");
					int cid = sc.nextInt();
					sc.nextLine(); // ���� �ڿ� �Էµ� ���͸� ����					
					
					
					// 5. SQL ������ �ϼ� - SQL_SELECT_BY_CID �� ?�� ä���ִ� �ڵ�  �ڡ�
					
					pstmt.setInt(1, cid);
					
					// 6. SQL ���� ����(DB ������ ����)
					rs = pstmt.executeQuery();
					
					// 7. ��� Ȯ��
					if(rs.next()) {
						String name = rs.getString(COL_NAME);
						String phone = rs.getString(COL_PHONE);
						String email = rs.getString(COL_EMAIL);
						
						System.out.println(name + "," + phone + "," + email);
					}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						rs.close();
						pstmt.close();
						conn.close();
						sc.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
		
		
	} // end main()

} // end JDBCMain05
