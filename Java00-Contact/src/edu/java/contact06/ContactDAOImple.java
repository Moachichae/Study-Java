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

	// Singleton ���� ����
	// 1. private static �ڱ��ڽ� Ÿ�� ��� ���� ����
	
	private static ContactDAOImple instance = null;
	 
	// 2. private ������
	private ContactDAOImple() {
		// 1. DB ����̹� ���(�޸� �ε�)
		try {
			DriverManager.registerDriver(new OracleDriver());			
			// TODO : stmt, conn close ���ֱ�
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 3. public static �ڱ��ڽ��� �����ϴ� �޼ҵ�
	public static ContactDAOImple getInstance() {
		if (instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}
	
	// conn, stmt ���ҽ� ���� �Լ�
	private void closeResource(Connection conn, Statement stmt) { // ������
		try {
			stmt.close();
			conn.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end closerResource
	
	// conn, stmt, rs  ���ҽ� ���� �Լ�
		private void closeResource(Connection conn, Statement stmt, ResultSet rs) { // �޼ҵ� �����ε�
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
		// 2. DB�� Connection(����)�� ����
		 Connection conn = null;	
		 PreparedStatement pstmt = null;		 
	
		// TODO : DB�� ������(VO) ����
		int result = 0;
		try { // connection �� pstmt�� �޼ҵ���� �����Ҷ����� ���� �ݾƾ��ϹǷ� 
			  // �޼ҵ� �ȿ��� �����ؾ��� (Ŭ���� ������ �����ع����� ��ü������(�̱������������) 
			  // �޼ҵ� �ѹ� ����� ���ÿ� ������ ������ ���Ұ�)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getEmail());
			result = pstmt.executeUpdate(); // 0�̸� insert ����, 1�̸� insert ����
			
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
		// TODO : DB���� ����ó ��ü ������ ��������
		 Connection conn = null;	
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
		ArrayList<ContactVO> list = new ArrayList<ContactVO>();
		
		try {			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_SELECT);
			rs = pstmt.executeQuery();  // stmt�� �ٲ㼭 �غ���
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
		// TODO : index ��ȣ(cid)�� ������ �˻��Ͽ� ��� ����(vo)	
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
		
		// TODO : index ��ȣ(cid)�� �˻��� ��ġ�� ������ ������Ʈ(vo)
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
	
		// TODO : index(cid)�� ������ ����
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
	


