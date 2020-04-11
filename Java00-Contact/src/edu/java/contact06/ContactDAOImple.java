package edu.java.contact06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import oracle.jdbc.OracleDriver;

public class ContactDAOImple implements ContactDAO, OracleQuery {

	// Singleton 패턴 적용
	// 1. private static 자기자신 타입 멤버 변수 선언
	
	private static ContactDAOImple instance = null;
	 
	// 2. private 생성자
	private ContactDAOImple() {
		// 1. DB 드라이버 등록(메모리 로드)
		try {
			DriverManager.registerDriver(new OracleDriver());			
			// TODO : stmt, conn close 해주기
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 3. public static 자기자신을 리턴하는 메소드
	public static ContactDAOImple getInstance() {
		if (instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}
	
	// conn, stmt 리소스 해제 함수
	private void closeResource(Connection conn, Statement stmt) { // 다형성
		try {
			stmt.close();
			conn.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end closerResource
	
	// conn, stmt, rs  리소스 해제 함수
		private void closeResource(Connection conn, Statement stmt, ResultSet rs) { // 메소드 오버로딩
			try {
				stmt.close();
				conn.close(); 
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // end closerResource


	

	@Override
	public int insert(ContactVO vo) {
		// 2. DB와 Connection(연결)을 맺음
		 Connection conn = null;	
		 PreparedStatement pstmt = null;		 
	
		// TODO : DB에 데이터(VO) 저장
		int result = 0;
		try { // connection 과 pstmt는 메소드들을 실행할때마다 열고 닫아야하므로 
			  // 메소드 안에서 실행해야함 (클래스 위에서 실행해버리면 객체생성과(싱글톤디자인패턴) 
			  // 메소드 한번 실행과 동시에 닫혀서 여러번 사용불가)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getEmail());
			result = pstmt.executeUpdate(); // 0이면 insert 실패, 1이면 insert 성공
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeResource(conn, pstmt);
		}
		
		
		return result;
	}

	@Override
	public ArrayList<ContactVO> select() {
		// TODO : DB에서 연락처 전체 데이터 가져오기
		 Connection conn = null;	
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
		ArrayList<ContactVO> list = new ArrayList<ContactVO>();
		
		try {			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_SELECT);
			rs = pstmt.executeQuery();  // stmt로 바꿔서 해보기
			while(rs.next()) {
//				int cid = rs.getInt(COL_CID);
				String name = rs.getString(COL_NAME);
				String phone = rs.getString(COL_PHONE);
				String email = rs.getString(COL_EMAIL);					
				list.add(new ContactVO(name, phone, email));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeResource(conn, pstmt, rs);
		}
		
		return list;
	} // end select()

	@Override
	public ContactVO select(String nameSearch) {
		// TODO : index 번호(cid)로 데이터 검색하여 결과 리턴(vo)	
		 ContactVO vo = null;
		 Connection conn = null;	
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_SELECT_BY_NAME);
			pstmt.setString(1, nameSearch);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString(COL_NAME);
				String phone = rs.getString(COL_PHONE);
				String email = rs.getString(COL_EMAIL);
				vo = new ContactVO(name, phone, email);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeResource(conn, pstmt, rs);
		}
		return vo;
	} // end select(String nameSearch)

	@Override
	public int update(String nameSearch, ContactVO vo) {
		
		// TODO : index 번호(cid)로 검색한 위치에 데이터 업데이트(vo)
		int result = 0;
		 Connection conn = null;	
		 PreparedStatement pstmt = null;		
		try {
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_UPDATE);			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, nameSearch);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeResource(conn, pstmt);
		}
		return result;
	}

	@Override
	public int delete(String nameSearch) {
	
		// TODO : index(cid)로 데이터 삭제
		 Connection conn = null;	
		 PreparedStatement pstmt = null;		 
		int result = 0;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_DELETE);
			pstmt.setString(1, nameSearch);		
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeResource(conn, pstmt);
		}
		return result;
	} // end delete()

	
	
	
	
	} // end ContactDAOImple
	


