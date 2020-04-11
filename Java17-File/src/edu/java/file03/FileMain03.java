package edu.java.file03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileMain03 {
	/*
	 1. �Ϲ����� try-catch-finally ����
	 try{
	 	(���๮��);
	 } catch (Exception e){
	 	(����ó��);
	 } finally {	
	 	(�׻� ������ �ڵ��); // ���ҽ� ����
	 }
	 
	 2. try-with-resource ���� : Java 7�������� ����
	 - try() �ȿ��� ������ ���ҵ��� ���� �ڵ�(close();)�� �ڵ����� ȣ������
	 try (���ҽ� ����;) {
	 	(���๮��);
	 } catch (Exception e) {
	 	(����ó��);
	 }		
	 */	

	public static void main(String[] args) {
		try (InputStream in = new FileInputStream("temp/original.txt");
				OutputStream out = new FileOutputStream("temp/copy2.txt");
				){ 
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
			
		} catch (Exception e) {
			
		}
		
	} // end main()

} // end FileMain03
