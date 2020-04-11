package edu.java.jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JDBCMain03 {
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
		System.out.println("JDBC 3 - select");
		
System.out.println("JDBC 2 - update");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;  // executeQuery() 리턴타입
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
			String sql_select = 
					"select * from " + TABLE_NAME + " order by " + COL_CID;
			System.out.println(sql_select);
			
			// 6. SQL 문장 실행(DB서버로 SQL 전송)
			// executeUpdate() : INSERT, UPDATE, DELETE를 처리할 때
			// executeQuery() : SELECT를 처리할 때
			rs = stmt.executeQuery(sql_select);
			
			
			// 7. 서버가 보낸 결과 확인/처리
			// ResultSet.next()"  //Iterater 와 비슷한구조
			// ResultSet에서 다음 행(row, 레코드)이 있으면
			// true를 리턴하고, ResultSet에서 가리키는 위치를 다음(Next) 위치로 변경
			StringBuffer buffer = new StringBuffer();
			while(rs.next()) { // 레코드가 존재할 때까지
				int cid = rs.getInt(1); // cid 컬럼  (컬럼의 타입보면서 메소드 설정)// 1행의로부터 열의 번호 (1행1열)
				String name = rs.getString(2); // name 컬럼  (1행2열)
				String phone = rs.getString(3); // phone 컴럼 (1행3열)
				String email = rs.getString(4); // email 컬럼 (1행4열)
				buffer.append(cid + "|")
					.append(name + "|")
					.append(phone + "|")
					.append(email + "\n");
			}
			
			System.out.println(buffer.toString());
			
			System.out.println("===============================");
			// select 특정 데이터 검색
			// cid를 이용하여 홍길동의 데이터를 가져오는 SQL 쿼리 작성
			String sql_select_by_cid =
					"select * from " + TABLE_NAME + " where name = '홍길동'" ;
			// "select * from " + TABLE_NAME + 
//				" where " + COL_CID + " = 2";
			System.out.println(sql_select_by_cid);
			rs = stmt.executeQuery(sql_select_by_cid);
			if(rs.next()) { // 첫번째 데이터(레코드)가 있으면
				int cid = rs.getInt(COL_CID); 
				String name = rs.getString(COL_NAME); // = rs.getString(2); : 타입이 바뀌어도 프로그램 스스로 
				String phone = rs.getString(COL_PHONE); // 컬럼명과 같은 이름으로 찾아감  
				String email = rs.getString(COL_EMAIL);
				
				System.out.println("인덱스 : " + cid);
				System.out.println("이름 : " + name);
				System.out.println("전화번호 : " + phone);
				System.out.println("이메일 : " + email);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 생성한 리소스 해제
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
