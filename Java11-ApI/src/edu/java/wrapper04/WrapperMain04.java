package edu.java.wrapper04;

import java.math.BigInteger;

// BigInteger : ������ �� �ִ� �������� �Ѱ谡 ���� Ŭ����
// BigDecimal : �Ǽ� ����� ������ ���̰ų� ���ֱ� ���ؼ� ������� Ŭ����
// auto boxing�� auto unboxing ����� �������� ����
// -> �����ڸ� ȣ���Ͽ� �ν��Ͻ��� �����ؾ� ��
// -> �������(+,-,*,/)�� �޼ҵ带 ����ؾ� ��
public class WrapperMain04 {

	public static void main(String[] args) {
//		long n = 12345678912345678912L;
		// long Ÿ�Ե� ������ �� �ִ� �Ѱ谡 ����
		
		// BinInteger �������� �Ű������� ���ڿ�
		// ���� : ���� ū ���� ���ͷ��� ������ �� �ִ� �⺻Ÿ���� ���� ������
		BigInteger big = new BigInteger("1234567891234567891234");
		System.out.println(big);
		
		// BigInteger�� ��Ģ����
		// add(), subtract(), multiply(), divide(), mod() �޼ҵ� ���
		BigInteger a = new BigInteger("10");
		BigInteger b = new BigInteger("20");
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		
	} // end main()

} // end WrapperMain04





















