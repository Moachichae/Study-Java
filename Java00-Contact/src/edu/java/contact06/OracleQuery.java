package edu.java.contact06;

// JDBC���� ���� �����, SQL ������� ����
public interface OracleQuery {
	public static final String URL = 
			"jdbc:oracle:thin:@172.16.1.19:1521:orcl"; // ������ ����Ŭ DB ��� ..??
	public static final String USER = "scott";
	public static final String PASSWORD = "tiger";

	public static final String TABLE_NAME = "ex_contact";
	public static final String COL_CID = "cid";
	public static final String COL_NAME = "name";
	public static final String COL_PHONE = "phone";
	public static final String COL_EMAIL = "email";	
	// TODO : sql query�� ���ڿ� ����� ����
	// select * from ex_contact order by cid
	public static final String SQL_SELECT = 
			"select * from " + TABLE_NAME + " order by " + COL_CID; // allselect	
	// select * from ex_contact where cid = ?
	public static final String SQL_SELECT_BY_NAME = 
			"select * from " + TABLE_NAME + " where " + COL_NAME + " = ?"; // select			
	// insert into ex_contact
	// values (contact_pk.nextval, ?, ?, ?)
	public static final String SQL_INSERT = 
			"insert into " + TABLE_NAME + " values (contact_pk.nextval, ?, ?, ?);"; //insert		
	// update ex_contact
	// set name = ?, phone = ?, email = ?
	// where cid = ?
	public static final String SQL_UPDATE =
			"update " + TABLE_NAME
			+ " set " + COL_NAME + " = ?, " 
			+ COL_PHONE  + " = ?, "
			+ COL_EMAIL + " = ?"
			+ " where "+ COL_NAME + " = ?";	 // update
	
	// delete from ex_contact where cid = ?
	public static final String SQL_DELETE = 
			"delete from " + TABLE_NAME + " where " + COL_NAME + " = ?"; // delete
}









