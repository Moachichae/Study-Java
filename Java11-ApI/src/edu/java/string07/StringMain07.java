package edu.java.string07;

import java.util.regex.Pattern;

public class StringMain07 {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// (02|010) : 02 �Ǵ� 010���� ����
		// - : '-'��ȣ Ȯ��
		// \d{3,4} : 3~4�ڸ��� ����
		// \d{4} : 4�ڸ��� ����
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
				// \w+ : �� �� �̻��� ���ĺ� �Ǵ� ����
		// @ : @�� �����ϴ� ��
		// \w+ : �� �� �̻��� ���ĺ� �Ǵ� ����
		// \. : .�� �����ϴ� ��
		// \w+ : �� �� �̻��� ���ĺ� �Ǵ� ����
		// (\.\w+)? : \.\w+ �� ���ų� �� �� �� �� �� ����
		data = "test@test.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

	} // end main()

} // end StringMain07
