package edu.java.file04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileMain04 {

	public static void main(String[] args) {
		try (InputStream in = new FileInputStream("temp/big_text.txt");
				OutputStream out = new FileOutputStream("temp/big2.txt")
				){
			int byteCopied = 0; // ����� ������ ũ�⸦ ������ ����
			long startTime = System.currentTimeMillis();
			// �ý����� ���� �ð��� milli-second ������ ����
			
			while(true) {
				// 1KB = 1,024 Bytes
				// 4KB = 4*1,024 Bytes
				// 1MB = 1024 * 1024 Bytes
				byte[] buffer = new byte[1024*1024]; // 1MB ����
				int result = in.read(buffer);
				
				// read(byte[] b) :
				// ���Ͽ��� ���� �����͸� �Ű����� �迭  b�� ����
				// ������ ���� ����Ʈ ���� ����, ���� �������� -1�� ����
				System.out.println("result = " + result);
				if (result == -1) { // ���� ���� ����
					break;
				}
				out.write(buffer, 0, result);
//				out.write(buffer);
				// write(byte[] b) :
				// �Ű����� �迭 b�� ������ �� ���� ���Ͽ� ��
				// write(byte[] b, int off, int len) :
				// �迭 b�� �ε��� off��°���� len ���̸�ŭ������ ���Ͽ� ��
				byteCopied += result;
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("���� ��� �ð� : " + (endTime - startTime)); // ���� ���� �ð� 
			System.out.println("����� ����Ʈ : " + byteCopied);
			
		} catch (Exception e) {
			
		}

	} // end main()

} // end FileMain04








