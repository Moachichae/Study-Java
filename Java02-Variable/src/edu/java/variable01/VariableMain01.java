package edu.java.variable01;

// ����(Variable)
// - ���� ������ �� �ִ� �޸� ����
// - �������� �ϳ��� ���� ���� ����
// - ��������
// Ÿ�� �����̸�;
public class VariableMain01 {

	// ���α׷��� ������ : main() �޼ҵ�  
	public static void main(String[] args) {
		System.out.println("����(Variable)");
		// Ctrl + Space bar : �ڵ��ϼ� ����Ű
		System.out.println();
		// Ctrl + F11 : �ڵ����� ����Ű
		int x = 10; //���� x�� 10�� ����
		System.out.println("x=" +x);
		
		int y; // ���� ����
		y = 20; // ���� �ʱ�ȭ(���� ����)
		System.out.println("y ="+y);
		
		x = 12; // �̹� ����� ������ ���� ����
		x = 12 + y; // �ٸ� ������ ������ �� ����
		y = 10;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("����:" + (x+y));
		System.out.println("������:"+ (x/y));
		// (����) / (����) : ���� ���� ���
		// (����) % (����) : ���� �������� ���
		
		

	} // end main()

} // end VariableMain01
