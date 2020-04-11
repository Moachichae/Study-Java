package edu.java.inherit07;

class ParentClass{
	private int x;

	public ParentClass(int x) {
		this.x = x;
		System.out.println("ParentClass(x) ������");
	}
	public int getX() {
		return x;
	}
} // end ParentClass

class ChildClass extends ParentClass {
	private int y;

	public ChildClass(int x, int y) {
		super(x);
		this.y=y;
		System.out.println("ChildClass(x,y) ������");
	}
	
	public int getY() {
		return y;
	}
} // end ChildClass


public class InheritMain07 {

	public static void main(String[] args) {
		// ������ ���� instanceof ������
		ParentClass test1 = new ParentClass(100);
		System.out.println();
		ParentClass test2 = new ChildClass(100,200);
		
		System.out.println(test2.getX());
		System.out.println();
		// test2�� ParentClass Ÿ������ �����߱� ������
		// ChildClass���� ������ getY() �޼ҵ带 ����� �� ����
		// ���� ����ȯ(casting)�� �ϸ�, ChildClass�� ������ �ִ� �޼ҵ� ��� ����
		System.out.println(((ChildClass)test2).getY());
		
		System.out.println();
//		System.out.println(((ChildClass)test1).getY()); // ���� �߻�
		
		
		// instanceof Ű����
		// - �������� instanceof Ŭ�����̸�
		// - ����� Ŭ���� Ÿ���� �ν��Ͻ��̸� true, �ƴϸ� false�� ����
		if(test2 instanceof ChildClass) {
			System.out.println("x = " + test2.getX());
			System.out.println("y = " + ((ChildClass)test2).getY());
		} else {
			System.out.println("x = " + test2.getX());			
		}
		
		System.out.println();
		
		System.out.println();
		if (test1 instanceof ChildClass) {
			System.out.println("x = " + test1.getX());
			System.out.println("y = " + ((ChildClass)test1).getY());
		} else {
			System.out.println("x = " + test1.getX());
		}
		
		System.out.println();
		if (test1 instanceof ChildClass) {
			System.out.println("�ڽ�");
		} else if (test1 instanceof ParentClass) {
			System.out.println("�θ�");
		} else {
			System.out.println("�Ѵ� �ƴ�");
		}

	} // end main()

} // end InheritMain07









