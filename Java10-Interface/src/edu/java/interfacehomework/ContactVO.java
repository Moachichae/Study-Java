package edu.java.interfacehomework;

public class ContactVO {

// 멤버 변수
	private String name;
	private String phone;
	private String email;

// 생성자
	public ContactVO() {}
	public ContactVO(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String str = "이름 : " + name + "\n"
							+ "휴대폰 : " + phone + "\n"
							+ "이메일 : " + email + "\n";				
		return str;
	} // end toString

	
	

} // end ContactVO


