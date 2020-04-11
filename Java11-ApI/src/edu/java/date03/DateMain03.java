package edu.java.date03;

import java.util.Calendar;

public class DateMain03 {

	public static void main(String[] args) {
		// Calendar : �߻� Ŭ����
		// |_GregorianCalendar : Calendar�� �ڽ� Ŭ����
		Calendar cal = Calendar.getInstance();
		// GregorianCalendar���ν��Ͻ�(����ð�)�� �����ϰ� ����
		System.out.println(cal);
		
		// ��¥�� �ð����� ����
		int year = cal.get(Calendar.YEAR);
		System.out.println("year : " + year);
		
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println("month : " + month);
		// Month : 1��(0) ~ 12��(11)
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("dat : " + day); // DAT : 1 ~ 31
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("hour : " + hour);
		// HOUR : 12�ð� ����, HOUR_OF_DAY : 24�ð� ����
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println("minute : " + minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println("second : " + second);
		
		String dateString = String.format("%d/%d/%d/%d:%d.%d",
				year, month, day, hour, minute, second);
		System.out.println(dateString);
		
		
		

	} // end main()

} // end DateMain03












