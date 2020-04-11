package edu.java.file10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.java.file06.Member;

public class FileMain10 {

	public static void main(String[] args) {
		// ObjectOutputStream, BufferedOutputStream,
		// FileOutputStream�� ����Ͽ�
		// ArrayList<Member> �ν��Ͻ��� ���Ͽ� ����
		
		/* �����͸� ArrayList�� �����ϴ� �ڵ� */
		OutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;
		
		try {
			out = new FileOutputStream("temp/list.txt");
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			long startTime = System.currentTimeMillis();
			List<Member> list = new ArrayList<Member>();
//			list = new LinkedList<Member>();
			// list�� �����Ͱ� ���� ���� (size = 0) �� ����
			// ArrayList�� �����͸� �߰��ϴ� ���� LinkedList���� ����		
			for(int i = 0; i < 1000000; i++) {
				String id = "member" + i;
				String pw = "pw" + i;
				Member m = new Member(i,id,pw);
				list.add(m);
			}
			
			oout.writeObject(list);
			// ArrayList<>�� Serializable �������̽��� �����ϰ� ����
			
			long endTime = System.currentTimeMillis();
			System.out.println("��� �ð� : " + (endTime - startTime));
			System.out.println("���� ���� ����");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/* ������ ������ �о ArrayList�� ������ ��� */
		// FileInputStream, BufferedInputStream, ObjectInputStream
		// �� ����Ͽ� ArrayList<Member> ��ü�� ���Ͽ��� �о��
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream("temp/list.txt");
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			ArrayList<Member> list = (ArrayList<Member>) oin.readObject();
			
			for(Member m : list) {
				m.displayInfo();
			}
			
			
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

	} // end main

} // end FileMain10












