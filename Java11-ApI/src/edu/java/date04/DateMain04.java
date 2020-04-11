package edu.java.date04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain04 {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(2020, 0, 17);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		String str = String.format("%d-%02d-%02d", year, month, day);
		System.out.println(str);
		
		System.out.println();
		// Calendar ��ü -> Date ��ü�� ��ȯ -> SimpleDateFormat ����ϴ� ��
		Calendar birth = new GregorianCalendar(1900, 1, 1);
		Date date = birth.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String birthString = sdf.format(date);
		System.out.println(birthString);
		

	} // end main()

} // end DateMain04
