package edu.java.access11;

public class AccessMain11 {

	public static void main(String[] args) {
		// Captain Ŭ������ �ν��Ͻ�(��ü) ����
		Captain c1 = Captain.getInstance();
		c1.setName("Mok");
		System.out.println(c1);
		System.out.println(c1.getName());
		
		System.out.println();
		Captain c2 = Captain.getInstance();
		System.out.println(c2);
		System.out.println(c2.getName());
		// * �ּҰ��� ������ ���� ��ü(�ν��Ͻ�)�� �����ϴ� ��
		//	  �ּҰ��� �ٸ��� �ٸ� ��ü(�ν��Ͻ�)�� ����ϴ� ��
		// ���� ��ü�� �����ϴ� ���� �������� ���浵 �����ϴ� ����.
		
		Test t1 = new Test();
		t1.setName("test");
		System.out.println(t1);
		System.out.println(t1.getName());
		
		Test t2 = new Test();
		System.out.println(t2);
		System.out.println(t2.getName());
		

	} // end main()

} // end AccessMain11
