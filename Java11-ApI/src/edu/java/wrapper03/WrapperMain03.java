package edu.java.wrapper03;

import java.util.Scanner;

public class WrapperMain03 {
	public static void main(String[] args) {
		String str = "2020년 1월 17일 12:10:10";
		String[] result = str.split("[^0-9]+");
		int sum = 0;		
//		String[] result = str.split("년 |일 |월 |:");
		for(String x : result) {			
			 sum += Integer.parseInt(x);			 
			}
		System.out.println(sum);
		
		
		System.out.println("======================");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		String[] list = input.split("[^0-9]+");
		for(String x : list) {
			if(!x.isEmpty()) { // isEmpty() : 문자열의 길이가 0인 경우 true(null은 아님)
		       System.out.println(x);
			}			
		}
				
		
	    
		
	} // end main()
} // end WrapperMain03







