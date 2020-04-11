package edu.java.inherit11;

// final : ��������, ������ �� ����
// - final + ��� ���� or �������� : ���(�ѹ� �ʱ�ȭ�� ���� ������ �� ���� ����)
// - final + �޼ҵ� : override�� �� ���� �޼ҵ�
// - final + Ŭ���� : ����� ������� �ʴ� Ŭ����

class SuperClass{
	public void test() {
		System.out.println("�׽�Ʈ");
	} // end test()
	
	public final void testFinal() {
		System.out.println("���̳� �޼ҵ�");
	}
} // end SuperClass

class SubClass extends SuperClass{
	
	@Override
	public void test() {
		System.out.println("override�� �׽�Ʈ �޼ҵ�");
	}
	
// testFinal() // final �޼ҵ�� ���� �Ұ� -> Override �Ұ�
} // end SubClass

final class FinalClass{
	private int x;
} // end FinalClass

// final class : ������ �� ���� Ŭ���� -> ��ӹ��� �� ���� Ŭ����
//class ChildClass extends FinalClass{}



public class InheritMain11 {
	public static final int Max = 100; // final ��� ����
	public static void main(String[] args) {
//		MAX = 100; // ���� �Ұ�
		
		final int number = 123; // final ���� ����
//		number = 456; // ���� �Ұ�
		

	} // end main()

} // end Inheritmain11
