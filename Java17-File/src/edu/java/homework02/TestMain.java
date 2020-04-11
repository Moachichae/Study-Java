package edu.java.homework02;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import edu.java.file06.Member;

public class TestMain {

	public static void main(String[] args) {			
		ArrayList<Student> list = new ArrayList<Student>(); // 배열 생성
		OutputStream out = null;
		ObjectOutputStream oout = null;	
		InputStream in = null;
		ObjectInputStream oin = null;
		
		
		
		try {
			out = new FileOutputStream("temp/Student.txt");
			oout = new ObjectOutputStream(out);
			for(int i = 0; i < 1; i++) {				
				list.add(ui());
				
			}			
			
			oout.writeObject(list);
			System.out.println("파일 저장 성공");
			
			
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			try {
				oout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			in = new FileInputStream("temp/Student.txt");
			oin = new ObjectInputStream(in);			
			
			 oin.readObject();
					
				
			
	     }	 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	} // end main()

	
	public static Student ui() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		sc.nextLine();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		sc.nextLine();		
		Student stu = new Student(name, math, eng);
		sc.close();
		return stu;		
	} // end ui()
	
} // end TestMain
