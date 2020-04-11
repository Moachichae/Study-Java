package edu.java.file07;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import edu.java.file06.Member;

// 프로그램 < == ObjectInputStream < == FileInputStream < == 파일(HDD)


public class FileMain07 {

	public static void main(String[] args) {
		InputStream in = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream("temp/member.txt");
			oin = new ObjectInputStream(in);
			
			while (true) {
				try {
					Member m = (Member) oin.readObject();  // 형 변환  
					m.displayInfo();					
				} catch(EOFException e) {
					break;
				}
			}
			
		} catch (Exception e) { // (Unhandled exception type IOException)에러발생시 Exception 변경
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	} // end main()

} // end FileMain07
