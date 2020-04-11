package edu.java.string05;

// String Ŭ���� : immutable Ŭ���� (������ �ٲ��� �ʴ� Ŭ����)
// StringBuffer, StringBuilder : Mutable Ŭ����(������ �ٲ� �� �ִ� Ŭ����)

// StringBuffer : Java 1.0 �������� ���� Ŭ����
//		- �߰�/���� �ӵ��� ����
//		- Thread-safe : �����忡 ������ Ŭ����
// StringBuilder : Java 5.0 �������� ���� Ŭ����
//		- �߰�/���� �ӵ��� ����
//		- Thread-unsafe : �����忡 �������� ���� Ŭ����
// �� �ܿ��� ��� ����� ����(������ ����� �޼ҵ���� ������ ����)

public class StringMain05 {

	public static void main(String[] args) {
		// StringBuffer, StringBuilder Ŭ����
		StringBuffer buffer = new StringBuffer("abc");
//		StringBuffer buff = "abc"; // ������ ����
		//StringBuffer, StringBuilder�� �ݵ�� �����ڸ� ����Ͽ� �ʱ�ȭ�ؾ� ��
		// ���ڿ� ���ͷ��� �ʱ�ȭ �Ұ���
		System.out.println(buffer); // toString() �޼ҵ尡 override�Ǿ� ���� ���
		System.out.println(buffer.hashCode());
		
		
		// append() : ���ڿ��� �����̴� �޼ҵ�
		buffer.append("def").append("ghi");
		System.out.println(buffer);
		System.out.println(buffer.hashCode());
		// hashcode�� �����ϸ� ���� ��ü(�ּ�)�� ���´�.
		
		System.out.println();
		String str = "abc";
		System.out.println(str);
		System.out.println(str.hashCode());
		str += "def";
		System.out.println(str);
		System.out.println(str.hashCode());
		// String ������ ���ڿ� ���� �� ���ο� �ּҷ� �����.
		// �׸�ŭ �޸𸮸� �����ϰ� �ǹǷ� Ư�� ��Ȳ(���ڿ� ����)������ ��ȿ������.
		// �ٸ�, �б� ������ ����ϸ� StringBuffer, StringBuilder ���� ȿ������.
		
		System.out.println();
		StringBuffer buffer2 = new StringBuffer("ABCDEF");
		buffer2.insert(2, "abc");
		System.out.println(buffer2);
		
		System.out.println();
		StringBuffer buffer3 = new StringBuffer("ABCDEF");
		buffer3.delete(1, 4);
		System.out.println(buffer3);
		
		System.out.println();
		StringBuffer buffer4 = new StringBuffer("Hello, Java!");
		buffer4.replace(0, 5, "�ȳ��ϼ���");
		System.out.println(buffer4);
		
		
		
		

	} // end main()

} // end StringMain05













