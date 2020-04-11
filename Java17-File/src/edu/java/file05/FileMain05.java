package edu.java.file05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// ���α׷� < == FileInputStream < == ����(HDD)
// FileInputStream�� read() �޼ҵ�� HDD�� ���� ���� -> �ӵ� ����
// ���α׷� < == BufferedInputStream < == FileInputStream < == ����(HDD)
// BufferedInputStream�� read() �޼ҵ�� �޸� ���ۿ��� ���� -> �ӵ� ����

//���α׷�  == > FileOutputStream  == > ����(HDD)
//FileOutputStream�� write() �޼ҵ�� HDD�� ���� ���� -> �ӵ� ����
//���α׷�  == > BufferedOutputStream  == > FileOutputStream  == > ����(HDD)
//BufferedOutputStream�� write() �޼ҵ�� �޸� ���ۿ��� ���� -> �ӵ� ����


public class FileMain05 {

	public static void main(String[] args) {		
	
		InputStream in = null;
		BufferedInputStream bin = null;
		OutputStream out = null;		
		BufferedOutputStream bout = null;
		
		
		try {
			in = new FileInputStream("temp/big_text.txt");
			// �޸� ���۸� �����ϴ� BufferedInputStream ��ü ����
			bin = new BufferedInputStream(in);
			
			out = new FileOutputStream("temp/big3.txt");
			// �޸� ���۸� �����ϴ� BufferedOutputStream ��ü ����
			bout = new BufferedOutputStream(out);			
			
			
			int data = 0; // read() �޼ҵ尡 �����ϴ� ���� ������ ����
			int byteCopied = 0; // write() �޼ҵ带 ȣ���� ������ 1�� ����
			long startTime = System.currentTimeMillis();
			while(true) {
				// read() : ���Ͽ��� 1����Ʈ�� �����͸� �о� ��
				//         ���� ���� �������� �� -1�� ����
//				data = bin.read();
				byte[] b = new byte[1024 * 1024];
				data = bin.read(b);
				System.out.println("data = " + data);
				
				if(data == -1) {
					break; // while�� ����
				}
				
				// write() : 1����Ʈ�� ���Ͽ� ��
//				bout.write(data);
				bout.write(b, 0, data);
				byteCopied += data;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("��� �ð� : " + (endTime - startTime));
		System.out.println(byteCopied + "����Ʈ �����");
			
			
		} catch (Exception e) {
		}
			finally {
				try {
				bin.close();
				bout.close();				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		

	} // end main()

} // end FileMain05







