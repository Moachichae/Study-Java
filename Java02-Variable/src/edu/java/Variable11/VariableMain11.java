package edu.java.Variable11;

import java.util.Scanner;

public class VariableMain11 {

	public static void main(String[] args) {
	    System.out.println("���ڿ� �Է� �ޱ�");
	    
	    String str = "+";
	    System.out.println(str);
	    
	    String str2 = "�ȳ��ϼ���";
	    System.out.println(str2);
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("���ڿ� �Է� : ");
	    String str3 = sc.nextLine();
	    System.out.println(str3);
	    
	    sc.close();
	    // nextInt() : ������ �Է¹޴� �޼ҵ�
	    // nextDouble() : �Ǽ��� �Է¹޴� �޼ҵ�
	    // nextLine() : ���ڿ� �� ���� �Է¹޴� �޼ҵ�
	    
	    // �Է¹��� ���ڿ��� ù ��° ���� ���
	    System.out.println(str3.charAt(0));
	    
	    // �Է¹��� ���ڿ��� ������ ���� ���
	    System.out.println(str3.charAt(str3.length()-1));
	    
	    
	  
	
	} // end main()

} // end VariableMain11

















