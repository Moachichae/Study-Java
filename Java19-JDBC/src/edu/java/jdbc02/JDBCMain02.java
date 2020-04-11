package edu.java.jdbc02;
 // update
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JDBCMain02 {
	// 1. DB에 사용될 상수들   //복붙 !
		public static final String URL = 
				"jdbc:oracle:thin:@localhost:1521:orcl"; // 접속할 오라클 DB 경로
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
			//2. Oracle JDBC 드라이버를 메모리에 로드
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 로드 성공");
		
			
			// 3. DB와 Connection(연결)을 맺음
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("DB 연결 성공");
			
			// 4. Connection 객체를 사용해서 Statement 객체를 생성
			stmt = conn.createStatement();
			
			// 5. SQL 문장 작성
			String sql_update = 
					"update " + TABLE_NAME
					+" set " + COL_NAME + " = '홍길동', "
					+ COL_PHONE + " = '111-222', "
					+ COL_EMAIL + " = 'test@test.com'"
					+ " where " + COL_CID + " = 1";  // sql 에서 똑같이 코드작성해서 실행하면 파일실행하면서 충돌 발생
			System.out.println(sql_update);
			
			// 6. SQL 문장 실행(DB서버로 SQL 전송)
			// executeUpdate() : INSERT, UPDATE, DELETE를 처리할 때
			// executeQuery() : SELECT를 처리할 때
			int result = stmt.executeUpdate(sql_update);
			
			// 7. DB서버가 보낸 결과 확인/처리
			System.out.println(result + "행이 수정됐습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 생성한 리소스 해제
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
