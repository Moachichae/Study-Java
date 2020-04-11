package edu.java.file13;

import java.io.File;

public class FileMain13 {
	public static final String TEST2 = "test2";
	public static final String TEST3 = "test3";
	public static final String DUMMY = "dummy.txt";	
			
	public static void main(String[] args) {
		// ����, ���丮 �̸� ����/����
		// test2 -> test3 ���丮 �̸� ����
		
		File org = new File(TEST2);
		File dest = new File(TEST3);
		
		if(org.renameTo(dest)) {
			System.out.println("���丮 �̸� ���� ����");
		} else {
			System.out.println("���丮 �̸� ���� ����");
		}
		
		// test3\dummy.txt ���� ����
		String filePath = TEST3 + File.separator + DUMMY;
		File file = new File(filePath);
		if(file.delete()) {
			System.out.println("���� ���� ����");
		} else {
			System.out.println("���� ���� ����");
		}
		
	} // end main()

} // end FileMain13
