package edu.java.oper01;

public class OperatorMain01 {

	public static void main(String[] args) {
		System.out.println("���� ������(=)");
		// ���� = ��;
		// - �������� ���� ������ ������ �����ϴ� ������
		int num = 246 + 234 + 100 / 10;
		System.out.println("num = " + num);
		
		System.out.println("=============");
		System.out.println("��� ������(+,-,*,/,%)");
		// (����) / (����) : ���� ���� ���
		// (���� ) % (����) : ���� �������� ���
		// (�Ǽ�) / (�Ǽ�) , (�Ǽ�) / (����), (����) / (�Ǽ�) :
		// �Ҽ������� ����ϴ� ������ ���
		System.out.println("���� ������ �� :" + (246 / 100));
		System.out.println("���� ������ ������ : " + (246%100));
		System.out.println("�Ǽ� ������ : " + (246 / 100.0));
		
		System.out.println(246/0.0);
		// ���� 0���� ������ ���� �Ұ����ϱ� ������ Exception �߻�
		// �Ǽ� 0.0���� ������ Infinity�� ����� ������.
		
	

	} // end main()

} // end OperatorMain01
