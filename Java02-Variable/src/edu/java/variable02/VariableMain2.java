package edu.java.variable02;

public class VariableMain2 {

	public static void main(String[] args) {
		System.out.println("���� ����,�ʱ�ȭ ����");
		
		// 1. ����, ����, ���� ���� ��������
		int korean, english, math;
		
		
		// 2. �� ���� ����
		korean = 90;
		english = 70;
		math = 95;
				
		
		// 3. �� ���� ���
		System.out.println("����:"+ korean);
		System.out.println("����:"+ english);
		System.out.println("����:"+ math);
		
		// 4. �� ������ ��(���� �����ؼ� ���� �� ���)
		int add = korean + english + math;
		System.out.println("�� ������ ��:"+add);
		
		// 5. ������ ��� ���� ���� �� ����, ���
		int average = add/3;
		System.out.println("���:"+average);		

	}

}
