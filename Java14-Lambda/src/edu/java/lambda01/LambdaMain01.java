package edu.java.lambda01;

class AdderImple implements Adder{

	@Override
	public double add(double x, double y) {		
		return x + y;
	}
	
} // end AdderImple

public class LambdaMain01 {

	public static void main(String[] args) {
		System.out.println("[1] 인터페이스를 구현하는 클래스 사용");
		AdderImple adder1 = new AdderImple();
		double result = adder1.add(2.0, 4.0);
		System.out.println("result = " + result);
		
		System.out.println();
		System.out.println("[2] 다형성 사용");
		Adder adder2 = new AdderImple();
		result = adder2.add(1.1, 1.2);
		System.out.println("result = " + result);
		
		System.out.println();
		System.out.println("[3] 익명 클래스 사용");
		Adder adder3 = new Adder() {
			@Override
			public double add(double x, double y) {				
				return x+y;
			}
			
		};
		result = adder3.add(5.0, 10.0);
		System.out.println("result = " + result);
		
		System.out.println();
		System.out.println("[4] 람다(lambda) 표현식");
		Adder adder4 = (x,y) -> x + y;
		result = adder4.add(1.1, 2.2);
		System.out.println("result = " + result);
		
		
		

	} // end main()

} // end LambdaMain01














