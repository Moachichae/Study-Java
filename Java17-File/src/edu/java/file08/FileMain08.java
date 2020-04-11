package edu.java.file08;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import edu.java.file06.Member;

// ObjectOutputStream을 사용했을 때 시간 측정
public class FileMain08 {

	public static void main(String[] args) {
		OutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;
		
		
		try {
//			out = new FileOutputStream("temp/big_member.txt");
			// BufferedOutputStream 사용
			out = new FileOutputStream("temp/big_memver2.txt");
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			long startTime = System.currentTimeMillis();
			
			for(int i = 0; i < 1000000; i++) {
				String id = "member" + i;
				String pw = "pw" + i;
				Member m = new Member(i,id,pw);
				
				oout.writeObject(m);
				
			}
			long endTime = System.currentTimeMillis();
			System.out.println("경과시간 : " + (endTime - startTime));
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
		
		
		
		
		
		
		
		
		
		

	} // end main()

} // end FileMain08













