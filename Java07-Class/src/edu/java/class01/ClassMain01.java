package edu.java.class01;

public class ClassMain01 {

	// ���α׷��� ������ : main() �޼ҵ�
	public static void main(String[] args) {
		// Ŭ������ "��ü(�ν��Ͻ�)"��"����"�Ѵ�.
		// Ŭ�����̸� �����̸� = new ������();
		
		// ���� Ÿ��
		// - �⺻Ÿ�Ժ��� : byte, char, int ��. ���� ���� ���� �ȿ� ����
		// ��) int a = 3, b = 10;
		// - ����Ÿ�Ժ��� : �迭, Ŭ����, �������̽� ��. �ּҸ� ���� ��ü ����(reference)
		// ��) int[] a = new int[3]; BasicTv tv = new BasicTv();
				
		BasicTv tv = new BasicTv();
		tv.displayInfo();
		// * �⺻ �����ڸ� ȣ���Ͽ� ��ü�� �����ϰ� �Ǹ�
		//   Ŭ������ �ɹ� �������� �⺻������ �ʱ�ȭ��
		//     ����(int, double, ...) Ÿ���� �⺻�� : 0
		//     boolean Ÿ���� �⺻�� : false
		//     �� �� Ÿ��(���� Ÿ��) : null
//		BasicTv tv2;
//		tv2.displayInfo();
		// NullPointerException : ���������� null ���� �������	
		//						     ��ü�� �ɹ� ������ �޼ҵ带 ����ϸ� �߻��ϴ� ���α׷� ����
		
		// TV�� ���(�޼ҵ�) ���
		// => BasicTv Ŭ������ ������ �ִ� �޼ҵ� ȣ��
		// ���������̸�.�޼ҵ�(�Ű�����);
		tv.turnOnOff(); // ���� on
		tv.displayInfo();
		
		tv.turnOnOff(); // ���� off
		tv.channelUp();
		tv.displayInfo();
	

	} // end main()

} // end ClassMain01














