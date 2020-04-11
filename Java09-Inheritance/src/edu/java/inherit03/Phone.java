package edu.java.inherit03;

public class Phone {
	// 멤버 변수
	private String phoneNo;
	
	// 생성자를 하나라도 정의한 경우, 자바 컴파일러는 기본생성자를 자동으로 만들어주지 않음!
	public Phone(String phoneNo) {
		this.phoneNo = phoneNo;
		System.out.println("phone(phoneNo) 생성자 호출");
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	// getter/setter
	
} // end Phone
