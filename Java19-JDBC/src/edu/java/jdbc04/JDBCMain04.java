package edu.java.jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class JDBCMain04 {
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
	
	// developer에 들어갈 쿼리 미리 작성
	// insert ex_contact 
	// values (contact_pk.nextval, ?, ?, ?)
	public static final String SQL_INSERT = 
		"insert into " + TABLE_NAME + " values (contact_pk.nextval, ?, ?, ?)";	
	// delete : cid 번호로 검색해서 데이터 삭제
	// delete form ex_contact where cid = ?
	public static final String SQL_DELETE = 
			"delete from " + TABLE_NAME + " where " + COL_CID + " = ?";
				
	// select : cid 번호로 검색해서 데이터 선택
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
		// 키보드 입력 준비
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 2. JDBC 드라이버를 등록(메모리에 로드)
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 등록 성공");
			
			// 3. DB 연결(Connection)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			
			// 4. PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(SQL_UPDATE);
			
			// 데이터를 입력
			System.out.println("수정할 인덱스 입력>");
			int cid = sc.nextInt();
			sc.nextLine(); // 숫자 뒤에 입력된 엔터를 제거
			
			System.out.println("수정할 이름 입력>");
			String name = sc.nextLine();
			
			System.out.println("수정할 전화번호 입력>");
			String phone = sc.nextLine();
			
			System.out.println("수정할 이메일 입력>");
			String email = sc.nextLine();
			
			// 5. SQL 문장을 완성 - SQL_UPDATE의 ?를 채워주는 코드  ★★
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, email);
			pstmt.setInt(4, cid);
			
			// 6. SQL 문장 실행(DB 서버로 전송)
			int result = pstmt.executeUpdate();
			
			// 7. 결과 확인
			System.out.println(result + "행이 수정되었습니다.");
			
			
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















