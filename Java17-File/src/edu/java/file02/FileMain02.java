package edu.java.file02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// ���α׷� < === InputStream < === �Է���ġ
// ���α׷� < === FileInputStream < === ����
// FileInputStream Ŭ������ read() �޼ҵ带 ����Ͽ� ������ ����

// ���α׷�  === > outputStream  === > �����ġ
// ���α׷�  === > FileOutputStream === > ����
// FileOutputStream Ŭ������ write() �޼ҵ带 ����Ͽ� ���Ͽ� ��

public class FileMain02 {

	public static void main(String[] args) {
		// temp/original.txt ���Ͽ��� �����͸� �о
		// temp/copy.txt ���Ͽ� �����͸� ��
		
		InputStream in = null;
		OutputStream out = null;
		
		try { // ���� Ȯ���� ���� ���������� try catch ���� 
			// ���Ͽ��� �����͸� �о� �� ����� FileInputStream �ν��Ͻ� ����
			in = new FileInputStream("temp/original.txt");
			
			// ���Ͽ� �����͸� �� ����� FileOutputStream �ν��Ͻ� ����
			out = new FileOutputStream("temp/copy.txt");
			
			int data = 0; // read() �޼ҵ尡 �����ϴ� ���� ������ ����
			int byteCopied = 0; // write() �޼ҵ带 ȣ���� ������ 1�� ����
			while(true) {
				// read() : ���Ͽ��� 1����Ʈ�� �����͸� �о� ��
				//         ���� ���� �������� �� -1�� ����
				data = in.read();				
				if(data == -1) {
					break; // while�� ����
				}
				
				// write() : 1����Ʈ�� ���Ͽ� ��
				out.write(data);
				byteCopied++;
			}
			
			// ���� ���� ��
			System.out.println(byteCopied + "����Ʈ �����");
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

	} // end main()

} // end FileMain02






