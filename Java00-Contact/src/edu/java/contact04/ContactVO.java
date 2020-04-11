package edu.java.contact04;

import java.io.Serializable;

// ������ Ŭ����(�̸�, ����ó, �̸���)
public class ContactVO implements Serializable {
	// ��� ����(�ʵ�, ������Ƽ)
	private String name;
	private String phone;
	private String email;
	
	// �⺻ ������
	public ContactVO() {}

	public ContactVO(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	// getter/setter �޼ҵ�
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
		String str = "�̸� :" + name + "\n"
				+ "��ȭ��ȣ : " + phone + "\n"
				+ "�̸��� : " + email + "\n";
		return str;
	}
	
	
	
} // end ContactVO







