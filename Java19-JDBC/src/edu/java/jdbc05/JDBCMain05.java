package edu.java.jdbc05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class JDBCMain05 {
	// 1. DB에 사용될 상수들   //복붙 !
	public static final String URL = 
						"jdbc:oracle:thin:@localhost:1521:orcl"; // 접속할 오라클 DB 경로 ..??
	public static final String USER = "scott";
	public static final String PASSWORD = "tiger";
		
	public static final String TABLE_NAME = "ex_contact";
	public static final String COL_CID = "cid";
	public static final String COL_NAME = "name";
	public static final String COL_PHONE = "phone";
	public static final String COL_EMAIL = "email";	
	
			// delete : cid 번호로 검색해서 데이터 삭제
			// delete form ex_contact where cid = ?
			public static final String SQL_DELETE = 
					"delete from " + TABLE_NAME + " where " + COL_CID + " = ?";
			
			// select : cid 번호로 검색해서 데이터 선택
			// select * from ex_contact where cid = ?
			public static final String SQL_SELECT_BY_CID =
					"select * from " + TABLE_NAME + " where " + COL_CID + " = ?";
	
	
	public static void main(String[] args) {
		// 키보드 입력 준비
				Scanner sc = new Scanner(System.in);
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null; // import 종류확인
				try {
					// 2. JDBC 드라이버를 등록(메모리에 로드)
					DriverManager.registerDriver(new OracleDriver());
					System.out.println("드라이버 등록 성공");
					
					// 3. DB 연결(Connection)
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
					System.out.println("DB 연결 성공");
					
					// 4. PreparedStatement 객체 생성
					pstmt = conn.prepareStatement(SQL_SELECT_BY_CID);
					
					// 데이터를 입력
					System.out.println("검색할 인덱스 입력>");
					int cid = sc.nextInt();
					sc.nextLine(); // 숫자 뒤에 입력된 엔터를 제거					
					
					
					// 5. SQL 문장을 완성 - SQL_SELECT_BY_CID 의 ?를 채워주는 코드  ★★
					
					pstmt.setInt(1, cid);
					
					// 6. SQL 문장 실행(DB 서버로 전송)
					rs = pstmt.executeQuery();
					
					// 7. 결과 확인
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
