package edu.java.HomeWork;

public class MemberService {
		
	
	public boolean login (String id,String password) {		
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		} 
		 			
		
	} // end login()
	
	public void logout(){
		System.out.println("로그아웃 되었습니다.");
	}
			
} // end Member
