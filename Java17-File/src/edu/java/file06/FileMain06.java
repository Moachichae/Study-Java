package edu.java.file06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

// ���α׷� == > ObjectOutputStream == > FileOutputStream == > ����(HDD)

// ObjectOutputStream���� ���Ǵ� ��ü��
// Serializable �������̽��� �����ϰ� �־�� ��.

public class FileMain06 {

	public static void main(String[] args) {
		OutputStream out = null;
		ObjectOutputStream oout = null;
		
		try {
			out = new FileOutputStream("temp/member.txt");
			oout = new ObjectOutputStream(out);
			
			Member m1 = new Member(1, "root", "root1234");
			oout.writeObject(m1);
			
			Member m2 = new Member(2, "root2", "root1234");
			oout.writeObject(m2);
			
			Member m3 = new Member(3, "root3", "root1234");
			oout.writeObject(m3);
			
			System.out.println("���� ���� ����!");
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				// ���ҽ�(oout)�� ���� �� ���� ���������� �����ȸ��ҽ��� �����ϸ�,
				// �� ���ҽ�(oout)�� ����ϰ� �ִ� �ٸ� ���ҽ�(out)�鵵 ���������� ��ü��.
				oout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	} // end main()

} // end FileMain06






