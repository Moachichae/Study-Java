package edu.java.HomeWork;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� : ");
		String id = sc.next();
		System.out.println("��й�ȣ : ");
		String password = sc.next();
		
		MemberService member1 = new MemberService();
		
		boolean result = member1.login(id, password);
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			System.out.println("�α׾ƿ� �ϰڽ��ϱ�? : \n true | false");
			boolean logout = sc.nextBoolean();
			if(logout == true){
				member1.logout();
			}
		} else {
			System.out.println("�ٽ� �α��� ���ּ���.");
		}
		
		sc.close();
		 		
		
		
		
		
		

	} // end main()

} // end MemberServiceExample
