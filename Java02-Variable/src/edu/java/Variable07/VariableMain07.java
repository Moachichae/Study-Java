package edu.java.Variable07;

// char : ���� �ϳ��� �����ϴ� ������ Ÿ��, 2����Ʈ
// - ������ �����ڵ� ��(0 �Ǵ� ��������)�� �����ϴ� Ÿ��
// - 0 ~ 65,535
// - ����(character)�� ���� ����ǥ('')�� ���
// - ���ڿ�(string)�� ū ����ǥ("")�� ���
// '��', '��','': ����(character) ���ͷ�
// - "�ѱ�", "�ѱ�", "" : ���ڿ�(string) ���ͷ�
public class VariableMain07 {

	public static void main(String[] args) {
		System.out.println("���� Ÿ��(char)");
		
		char ch1 = 'A';
		System.out.println("ch1 = "+ch1); // ���� ��ü ���
		System.out.println("ch1 = "+(int)ch1); // ������ �ڵ尪 ��� (���� �� ��ȯ)
		
		char ch2 = 'B';
		System.out.println("ch2 = "+ch2); // ���� ��ü ���
		System.out.println("ch2 = "+(int)ch2); // ������ �ڵ尪 ��� 
		
		char ch3 = '1';
		System.out.println("ch3 = "+ch3); // ���� ��ü ���
		System.out.println("ch3 = "+(int)ch3); // ������ �ڵ尪 ���

		char ch4 = 1;
		System.out.println("ch4 = " + ch4);
		System.out.println("ch4 = " + (int)ch4);
		
		// (char)ch3 + 2
		ch4 = (char)(ch3 + 2);
		System.out.println(ch4);
		
		
		// ���� ���� �� ����
		boolean b = '��' < '��';
		System.out.println("b="+b);
		
		
	} // end main()

} // end VariableMain07