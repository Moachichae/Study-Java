package edu.java.method01;


// �޼ҵ� : ����� �����ϱ� ���� �ڵ�
// - �޼ҵ�� Ŭ���� �ȿ���, �ٸ� �޼ҵ� �ܺο��� �����(����)
// - (����) �޼ҵ� �ȿ� �Ǵٸ� �޼ҵ带 ���� �� ����
// - �޼ҵ� ���� :
//   [���ľ�] ����Ÿ�� �޼ҵ��̸�([�Ű�����1, �Ű�����2, ...]) { ���� }
//    ���ľ� : public, private, static, ... - ��������
//   ����Ÿ�� : �ڷ�Ÿ��(int, double, String, Class, ...], void(����)
//   �Ű����� : �޼ҵ带 ȣ���� �� �����ϴ� ������
//           ���޹޴� �����Ͱ� ������ �Ű����� ������ ��� ��.
//           ()�� ������ �� ����
//   {...} : �޼ҵ� ��ü(body)
public class MethodMain01 {
	
	// �޼ҵ�
	public static void sayHello(String name) { // name = "�丣" ����
		System.out.println("�ȳ��ϼ���~");
	    System.out.println("���� " + name + "�Դϴ�!"); // "�丣" ��µ�
	} // end sayHello()
	
	public static void sayAge(int age) {
		System.out.println("�� ���̴�" + age + "�Դϴ�!");
	} // end sayAge()
	
	// static ���ľ� : ���α׷��� ����� �� �����ϵ��� �����ϴ� Ű����
	// static �޼ҵ忡���� static���� ����� �޼ҵ常 ȣ�� ����
	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���~");
	    System.out.println("���� �丣�Դϴ�!");
		
		sayHello("�丣"); // �޼ҵ� ȣ��. ���ڰ����� "�丣"�� �Ѱ���
		sayHello("���̾��");
		
		sayAge(20);
		
	} // end main()

} // end MethodMain01




















