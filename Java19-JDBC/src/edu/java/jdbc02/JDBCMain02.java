package edu.java.jdbc02;
 // update
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JDBCMain02 {
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
		System.out.println("JDBC 2 - update");
		
		Connection conn = null;
		Statement stmt = null;
		
		
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
			String sql_update = 
					"update " + TABLE_NAME
					+" set " + COL_NAME + " = 'ȫ�浿', "
					+ COL_PHONE + " = '111-222', "
					+ COL_EMAIL + " = 'test@test.com'"
					+ " where " + COL_CID + " = 1";  // sql ���� �Ȱ��� �ڵ��ۼ��ؼ� �����ϸ� ���Ͻ����ϸ鼭 �浹 �߻�
			System.out.println(sql_update);
			
			// 6. SQL ���� ����(DB������ SQL ����)
			// executeUpdate() : INSERT, UPDATE, DELETE�� ó���� ��
			// executeQuery() : SELECT�� ó���� ��
			int result = stmt.executeUpdate(sql_update);
			
			// 7. DB������ ���� ��� Ȯ��/ó��
			System.out.println(result + "���� �����ƽ��ϴ�.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// ������ ���ҽ� ����
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		

	} // end main()

} // end JDBCMain02
