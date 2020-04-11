package edu.java.file09;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import edu.java.file06.Member;

public class FileMain09 {

	public static void main(String[] args) {
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream("temp/big_member.txt");
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			List<Member> list = new ArrayList<Member>();
			long startTime = System.currentTimeMillis();
			while(true) {
				try {
					Member m = (Member) oin.readObject();
					list.add(m);
				} catch (EOFException e) {
					break;
				}
			}
			long endTime = System.currentTimeMillis();
			System.out.println("경과 시간 : " + (endTime - startTime));
			System.out.println("리스트 크기 : " + list.size());
			
//			for(Member m : list) {
//				m.displayInfo();
//			}
			
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

	} // end main()

} // end FileMain09
