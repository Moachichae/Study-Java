package edu.java.inherit01;

public class InheritMain01 {

	public static void main(String[] args) {
		// SmartTv Ŭ������ �ν��Ͻ� ����
		SmartTv tv1 = new SmartTv();
		tv1.turnOnOff(); // �ڽ� Ŭ������ �θ� Ŭ������ �޼ҵ� ��� ����
		tv1.setIp("172.163.1.31");
		System.out.println(tv1.getIp());
		
		
		BasicTv tv2 = new BasicTv();
//		tv2.setIp(""); // �θ� Ŭ������ �ڽ� Ŭ������ �޼ҵ带 ����� �� ����.
		

	} // end main()

} // end InheritMain01
