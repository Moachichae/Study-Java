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
		// FileOutputStream을 사용하여
		// ArrayList<Member> 인스턴스를 파일에 저장
		
		/* 데이터를 ArrayList에 저장하는 코드 */
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
			// list에 데이터가 없는 상태 (size = 0) 일 때는
			// ArrayList로 데이터를 추가하는 것이 LinkedList보다 빠름		
			for(int i = 0; i < 1000000; i++) {
				String id = "member" + i;
				String pw = "pw" + i;
				Member m = new Member(i,id,pw);
				list.add(m);
			}
			
			oout.writeObject(list);
			// ArrayList<>는 Serializable 인터페이스를 구현하고 있음
			
			long endTime = System.currentTimeMillis();
			System.out.println("경과 시간 : " + (endTime - startTime));
			System.out.println("파일 저장 성공");
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
		
		/* 데이터 파일을 읽어서 ArrayList의 내용을 출력 */
		// FileInputStream, BufferedInputStream, ObjectInputStream
		// 을 사용하여 ArrayList<Member> 객체를 파일에서 읽어옴
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












