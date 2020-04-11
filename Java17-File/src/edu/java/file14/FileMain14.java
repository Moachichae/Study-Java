package edu.java.file14;

import java.io.File;

public class FileMain14 {

	public static void main(String[] args) {
		// ���� ���丮( current working directory) ���� Ȯ��
		String cwd = System.getProperty("user.dir");
		System.out.println("CWD : " + cwd);
		
		// ���� ���丮�� ���� File ��ü
		File f = new File(cwd);
		// getName() : ����, ���丮�� �̸��� ����
		System.out.println("�̸� : " + f.getName());
		// getPath() : ��θ� ����
		//		File ��ü�� ������ ��
		//		1) ���� ��η� ����������, ���� ��η� �̸��� ����
		//		2) ��� ��η� ����������, ��� ��η� �̸��� ����
		System.out.println("��� : " + f.getPath());
		// f.getAbsolutePath() : ���� ��θ� ����
		System.out.println("���� ��� : " + f.getAbsolutePath());
		// isDirectory() : File ��ü�� ���丮�̸� true��  ����
		// isFile() : File ��ü�� �����̸� true�� ����
		System.out.println("���丮?" + f.isDirectory());
		System.out.println("����?" + f.isFile());
		
		// listFiles() : ����(���丮)�� ���� Ȯ��
		File[] list = f.listFiles();
		for (File file : list) {
			if(file.isDirectory()) { // ���丮?
				System.out.print("<DIR>\t"); // \t " ��
			} else { // ����? 
				System.out.print(file.getName() + "<FILE>\t");
				System.out.println(file.length() + "Bytes");
			}
		}

	} // end main()

} // end FileMain14
