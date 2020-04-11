package edu.java.interface07;

// VO(Value Object) : MVC ������ ���Ͽ��� Model Ŭ����
// DTO(Data Transfer Object)


public class MemberVO {
	// ��� ����(�ʵ�, ������Ƽ)
	private String id; // ȸ�� ���̵�
	private String pw; // ȸ�� ��й�ȣ
	private String email; // ȸ�� �̸���
	
	// ������
	public MemberVO() {}
	public MemberVO(String id, String pw, String email) {
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	
	// getter/setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String str = "���̵� : " + id + "\n" // "\n" : �ٹٲ�
				+ "��й�ȣ : " + pw + "\n" 
				+ "�̸��� : " + email + "\n";
		return str;
	} // end toString()
	
	
	
	
} // end MemberVO


















