package edu.java.switch03;

public class SwitchMain03 {

	public static void main(String[] args) {
		System.out.println("switch�� ����");
		
		String position = "�Ϲ� ȸ��";
		
		switch(position) {
		case "��� ȸ��" :
			System.out.println("����ǰ 2��");
			break;
		case "�Ϲ� ȸ��" :
			System.out.println("����ǰ 1��");
			break;
		default :
			System.out.println("�մ�");
			break;
		} // end main()

	} // end SwitchMain03

}
