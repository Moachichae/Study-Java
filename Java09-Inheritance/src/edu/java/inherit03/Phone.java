package edu.java.inherit03;

public class Phone {
	// ��� ����
	private String phoneNo;
	
	// �����ڸ� �ϳ��� ������ ���, �ڹ� �����Ϸ��� �⺻�����ڸ� �ڵ����� ��������� ����!
	public Phone(String phoneNo) {
		this.phoneNo = phoneNo;
		System.out.println("phone(phoneNo) ������ ȣ��");
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	// getter/setter
	
} // end Phone
