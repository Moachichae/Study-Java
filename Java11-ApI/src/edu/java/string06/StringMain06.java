package edu.java.string06;

public class StringMain06 {

	public static void main(String[] args) {
		String str = "���:��:�ٳ���:������";
		String[] result  = str.split(":");
		for(String x : result) {
			System.out.println(x);
		}
		StringBuffer buff = new StringBuffer(result[0]);
		
		buff.append(result[1]).append(result[2]).append(result[3]);
		System.out.println(buff); // TODO : for each ������ �ۼ� �غ���
		
		

	} // end main()

} // end StringMain06
