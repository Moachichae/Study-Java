package edu.java.method02;

public class MethodMain02 {

	// �޼ҵ� �̸� : add
	// ��� : �� ���� ������ �Ű������� ���޹޾Ƽ�, �� ������ ���� ����
	// ����Ÿ�� : int
	// �Ű����� : int x, int y
	public static int add(int x, int y) {
//		int sum = x + y;
		return x + y;
	} // end add()

	// �޼ҵ� �̸� : sub
	// ��� : �� ���� ������ �Ű������� ���޹޾Ƽ�, �� ������ ���� ����
	// ����Ÿ�� : int
	// �Ű����� : int x, int y
	public static int sub(int x, int y) {
		return x - y;
	} // end sub()

	// �޼ҵ� �̸� : mul
	// ��� : �� ���� �Ǽ�(double)�� ���޹޾Ƽ�, �� ���� ���� ����
	// ����Ÿ�� : double
	// �Ű����� : double x, double y
	public static double mul(double x, double y) {
		return x * y;
	} // end mul()

	// �޼ҵ� �̸� : div
	// ��� : �� ���� �Ǽ�(double)�� ����پƼ�, ���� ���� ����
	// ����Ÿ�� : double
	// �Ű����� : double x, double y
	public static double div(double x, double y) {
		return x / y;
	} // end div()

	public static void main(String[] args) {
		System.out.println("�޼ҵ� ����");
		int result = add(10, 20);
		System.out.println("result = " + result);
		result = sub(100, 10);
		System.out.println("result = " + result);

		double m = mul(1.5, 2.0);
		System.out.println("m = " + m);
		
		double d = div(3, 2);
		System.out.println("d = " + d);

	} // end main()

} // end MethodMain02









