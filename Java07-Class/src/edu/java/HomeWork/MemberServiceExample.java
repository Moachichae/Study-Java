package edu.java.HomeWork;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String id = sc.next();
		System.out.println("비밀번호 : ");
		String password = sc.next();
		
		MemberService member1 = new MemberService();
		
		boolean result = member1.login(id, password);
		if(result) {
			System.out.println("로그인 되었습니다");
			System.out.println("로그아웃 하겠습니까? : \n true | false");
			boolean logout = sc.nextBoolean();
			if(logout == true){
				member1.logout();
			}
		} else {
			System.out.println("다시 로그인 해주세요.");
		}
		
		sc.close();
		 		
		
		
		
		
		

	} // end main()

} // end MemberServiceExample
