package edu.java.file12;

import java.io.File;
import java.io.IOException;

public class FileMain12 {
	public static final String DIR_NAME = "test2";
	public static final String FILE_NAME = "dummy.txt";
	public static final String FILE_PATH = 
			DIR_NAME + File.separator + FILE_NAME;
	
	public static void main(String[] args) {
		System.out.println(FILE_PATH);
		
		File f = new File(FILE_PATH);
		if(!f.exists()) {
			System.out.println("������ �����ϴ�.");
			
			try {
				if(f.createNewFile()) {
					System.out.println("���� ���� ����");
				} else {
					System.out.println("���� ���� ����");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}

	} // end main()

} // end FileMain12
