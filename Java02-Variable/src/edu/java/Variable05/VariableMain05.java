package edu.java.Variable05;

public class VariableMain05 {

	public static void main(String[] args) {
		System.out.println("�Ǽ� �ڷ���(Floating point)");

        // float : 4����Ʈ�� ����Ǵ� �Ǽ� Ÿ��
	    // double : 8����Ʈ�� ����Ǵ� �Ǽ� Ÿ��
		// double Ÿ���� float Ÿ�Ժ��� �� ũ��,
		// �� ������(�Ҽ��� ���� �ڸ����� ��ŭ) ���� ǥ���� �� ����
		// �ڹٿ��� �Ǽ� Ÿ�� ���ͷ�(���)�� �⺻Ÿ���� double
		// 1.23 -> �ڹٴ� double ���
		double x = 3.14;
		System.out.println("x=" +x);
		
		float y = 3.14f;
		System.out.println("y =" +y);
		// �ڹٿ��� �Ǽ� ���ͷ��� double�� ����ϱ� ������,
		// float Ÿ������ ����ϱ� ���ؼ��� �빮�� F �Ǵ� �ҹ��� f�� ���� �ڿ� �ٿ���
		
		double n1 = 123; // int -> double �ڵ� �� ��ȯ
		double n2 = 100; 
		System.out.println("n1="+n1);
		System.out.println("n2="+ n2);
		System.out.println("������:"+(n1 / n2));
		System.out.printf("������ :%.5f",(n1/n2));
		// %.nf : �Ҽ��� n°�ڸ����� ���  
		
		
	} // end main()

} // end VariableMain05
