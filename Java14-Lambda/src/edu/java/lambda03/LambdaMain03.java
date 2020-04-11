package edu.java.lambda03;

@FunctionalInterface
interface Test1{
	public abstract void printMax(int x, int y);
} // end Test1

@FunctionalInterface
interface Test2{
	public abstract int findMax(int x, int y);
} // end Test2

public class LambdaMain03 {

	public static void main(String[] args) {
		// ���� ǥ������ �̿��Ͽ� ����
		Test1 test1 = (x,y) -> {
			int max;
			if(x > y) {
				max = x;
			} else {
				max = y;				
			}
			System.out.println("�ִ밪 : " + max);
		};
		test1.printMax(100, 101);
		
		Test2 test2 = (x,y) -> {
			// ���� ������
			return (x > y) ? x : y;
		};
		System.out.println("�ִ밪 : " + test2.findMax(10, 5));
		

	} // end main()

} // end LamdaMain03














