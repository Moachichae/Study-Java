package edu.java.inherit03;

public class SmartPhone extends Phone{
	private String ip;
	
	// ������
	// - �ڽ� Ŭ������ �����ڰ� ȣ��Ǹ�,
	//   �θ� Ŭ������ �����ڰ� ���� ����� ��, �ڽ� Ŭ������ �ڵ���� �����
	//	 1) �θ� Ŭ������ �����ڸ� ��������� ȣ������ ���� ���� super()�� �ڵ����� ȣ��
	//	 2) �θ� Ŭ������ �����ڸ� ��������� super(); �Ǵ� super(�Ű�����); �� ȣ�� ����
	//	 super()�� �ڵ����� ȣ��� �� ���� ������,
	//	 �ڽ� Ŭ������ �����ڿ��� super(�Ű�����) ȣ���ϴ� �ڵ尡 �ݵ�� �־�� ��
	public SmartPhone() {
		super(null);
		System.out.println("SmartPhone ������ ȣ��");	
	}
	
	public SmartPhone(String phoneNo) {
		super(phoneNo);
		System.out.println("smartPhone(phoneNo) ������ ȣ��");
	}
	
	public SmartPhone(String phoneNo, String ip) {
		super(phoneNo);
		this.ip = ip;
		System.out.println("SmartPhone(phoneNo, ip) ������ ȣ��");
	}

} // end SmartPhone
