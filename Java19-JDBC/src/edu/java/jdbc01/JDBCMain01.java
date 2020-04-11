package edu.java.jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// insert
import oracle.jdbc.OracleDriver;

// JDBC : Java Database Connection
// 0. �����ͺ��̽� ���̺귯���� ������Ʈ�� �߰�
//	  1) ������Ʈ�� lib ������ ����
//	  2) C:\Users\goott1\product\11.2.0\dbhome_1\jdbc\lib
//	   �Ǵ� (����Ŭ ��ġ ���)\product\11.2.0\dbhome_1\jdbc\lib (11g home ����)
//	   ������ �ִ� ojdbc5.jar ������ lib ������ ����
//	  3) ������ jar ����(���̺귯��)�� ���� �н��� �߰� (Add to build path)
//1.  DB�� �����ϱ� ���ؼ� �ʿ��� ������� ����(����)
//2.  JDBC ����̹��� �޸𸮿� �ε�
//3.  DB�� Connection(����)�� ����
//4.  Connection ��ü�� ����ؼ� Statement ��ü�� ����
//5.  SQL ������ �ۼ�
//6.  Statement ��ü�� ����ؼ� SQL ������ ����(DB ������ SQL ������ ����)
//7.  DB ������ ������ ����� Ȯ��/ó��

public class JDBCMain01 {
	// 1. DB�� ���� �����
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
		System.out.println("JDBC 1");
		
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
			String sql_insert =
					"insert into " + TABLE_NAME
					+ " values (contact_pk.nextval,'aaa','010-111-1111','test@test.com')"; // ���� �� ��Ÿ �Ű�����
			System.out.println(sql_insert);
			
			// 6. SQL ���� ����(DB������ SQL ����)
			int result = stmt.executeUpdate(sql_insert);
			
			// 7. DB������ ���� ��� Ȯ��/ó��
			System.out.println(result + "���� ���Եƽ��ϴ�.");
			
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

} // end JDBCMain01













