package edu.java.homework;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		OutputStream out= null;
		ObjectOutputStream oout = null;
		
		try {
			out = new FileOutputStream("temp/student.txt");
			oout = new ObjectOutputStream(out);
			
			for (int i = 0 ; i < 3; i ++) {
				System.out.println("이름 입력>");
				String name = sc.nextLine();
				System.out.println("수학점수 입력>");
				int math = sc.nextInt();
				System.out.println("영어점수 입력>");
				int eng = sc.nextInt();
				sc.nextLine();
				
				Student s = new Student(name, math, eng);
				oout.writeObject(s);
				
			}
			sc.close();
			System.out.println("데이터 저장 완료");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		InputStream in = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream("temp/student.txt");
			oin = new ObjectInputStream(in);
			
			while (true) {
				try {
					Student s = (Student) oin.readObject();
					s.displayInfo();					
				} catch (EOFException e) {
					break;
				}
			}
			System.out.println("파일을 끝까지 읽었음!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	} // end main()

} // end TestMain

