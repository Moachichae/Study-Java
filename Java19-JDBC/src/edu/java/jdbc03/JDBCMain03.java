package edu.java.jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JDBCMain03 {
	// 1. DB�� ���� �����   //���� !
			public static final String URL = 
					"jdbc:oracle:thin:@localhost:1521:orcl"; // ������ ����Ŭ DB ���
			public static final String USER = "scott";
			public static final String PASSWORD = "tiger";
			
			public static final String TABLE_NAME = "ex_contact";
			public static final String COL_CID = "cid";
			public static final String COL_NAME = "name";
			public static final String COL_PHONE = "phone";
			public static final String COL_EMAIL = "email";	
			
	public static void main(String[] args) {
		System.out.println("JDBC 3 - select");
		
System.out.println("JDBC 2 - update");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;  // executeQuery() ����Ÿ��
		try {
			//2. Oracle JDBC ����̹��� �޸𸮿� �ε�
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("����̹� �ε� ����");
			
			// 3. DB�� Connection(����)�� ����
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("DB ���� ����");
			
			// 4. Connection ��ü�� ����ؼ� Statement ��ü�� ����
			stmt = conn.createStatement();
			
			// 5. SQL ���� �ۼ�
			String sql_select = 
					"select * from " + TABLE_NAME + " order by " + COL_CID;
			System.out.println(sql_select);
			
			// 6. SQL ���� ����(DB������ SQL ����)
			// executeUpdate() : INSERT, UPDATE, DELETE�� ó���� ��
			// executeQuery() : SELECT�� ó���� ��
			rs = stmt.executeQuery(sql_select);
			
			
			// 7. ������ ���� ��� Ȯ��/ó��
			// ResultSet.next()"  //Iterater �� ����ѱ���
			// ResultSet���� ���� ��(row, ���ڵ�)�� ������
			// true�� �����ϰ�, ResultSet���� ����Ű�� ��ġ�� ����(Next) ��ġ�� ����
			StringBuffer buffer = new StringBuffer();
			while(rs.next()) { // ���ڵ尡 ������ ������
				int cid = rs.getInt(1); // cid �÷�  (�÷��� Ÿ�Ժ��鼭 �޼ҵ� ����)// 1���Ƿκ��� ���� ��ȣ (1��1��)
				String name = rs.getString(2); // name �÷�  (1��2��)
				String phone = rs.getString(3); // phone �ķ� (1��3��)
				String email = rs.getString(4); // email �÷� (1��4��)
				buffer.append(cid + "|")
					.append(name + "|")
					.append(phone + "|")
					.append(email + "\n");
			}
			
			System.out.println(buffer.toString());
			
			System.out.println("===============================");
			// select Ư�� ������ �˻�
			// cid�� �̿��Ͽ� ȫ�浿�� �����͸� �������� SQL ���� �ۼ�
			String sql_select_by_cid =
					"select * from " + TABLE_NAME + " where name = 'ȫ�浿'" ;
			// "select * from " + TABLE_NAME + 
//				" where " + COL_CID + " = 2";
			System.out.println(sql_select_by_cid);
			rs = stmt.executeQuery(sql_select_by_cid);
			if(rs.next()) { // ù��° ������(���ڵ�)�� ������
				int cid = rs.getInt(COL_CID); 
				String name = rs.getString(COL_NAME); // = rs.getString(2); : Ÿ���� �ٲ� ���α׷� ������ 
				String phone = rs.getString(COL_PHONE); // �÷���� ���� �̸����� ã�ư�  
				String email = rs.getString(COL_EMAIL);
				
				System.out.println("�ε��� : " + cid);
				System.out.println("�̸� : " + name);
				System.out.println("��ȭ��ȣ : " + phone);
				System.out.println("�̸��� : " + email);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// ������ ���ҽ� ����
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end main()

} // end JDBCMain03
