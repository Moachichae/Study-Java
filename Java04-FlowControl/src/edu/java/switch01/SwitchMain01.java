package edu.java.switch01;


// switch
// - if���� ���� ���̴� ���
// - ������ ���� ���� ���๮�� ���õ�
// - ���� ����
//    switch(����) {
//      case Ư���� : ����1; (break;)
//      case Ư���� : ����2; (break;)
//      default : ����3; (break;)
//   }

public class SwitchMain01 {

	public static void main(String[] args) {
		System.out.println("switch��");
		
		System.out.println( Math.random());
		// Math.random() : 0 �̻� 1 �̸��� �� �� �������� double���� ������
		int num = (int) (Math.random() * 6); // double -> int ���� �� ��ȯ
		
		
		switch(num) {
		case 1:
			System.out.println("1���� ���Խ��ϴ�.");
			break; // break : ���� case���� �������� �ʰ� switch�� ����
		case 2:
			System.out.println("2���� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("3���� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4���� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5���� ���Խ��ϴ�.");
			break;
		default : // ���� ��� �ܿ� ���� ������ �����
			System.out.println("6���� ���Խ��ϴ�.");
			break;
			
		}
		

	} // end main()

} // end SwitchMain01
