package edu.java.inherit06;


// ���⼺(Polymorphism)
// - ��ü(�ν��Ͻ�)�� ���� ���� Ÿ���� ȣ���� �� �ִ� ��.
// - ������ �ν��Ͻ��� ����Ű��(�����ϴ�) ���� ������ ������ ��
//	 ������ �ν��Ͻ��� Ŭ���� Ÿ���� ������ ������ ���� �ְ�
//	 �� �θ� Ÿ������ ������ ������ ���� �ִ� ��.
// - �������� ���� :
// 1. �迭�� ����� �� �θ� Ÿ�����θ� �����ص�
//	  �� �迭���� �θ�/�ڽ� Ÿ�� ��� ���� ����.
// 2. �޼ҵ带 ������ �� �޼ҵ��� �Ű������� ���� Ÿ������ �θ� Ŭ���� Ÿ�Ը�
//	  ����ص� �θ�/�ڽ� Ÿ�� ��� �Ű������� ���ϰ����� ����� �� ����.

public class InheritMain06 {

	public static void main(String[] args) {
		// Car Ŭ������ �ν��Ͻ� ����
		Car car1 = new Car();
		
		// HybirdCar Ŭ������ �ν��Ͻ� ����
		HybridCar car2 = new HybridCar();
		
		Car car3 = new HybridCar(); // ������(polymorphism)
//		HybridCar car4 = new Car(); // �ڽ� Ŭ������ �θ� Ŭ���� ��ü ���� �Ұ���
		// Child �����̸� = new Child(); - ����
		// Parent �����̸� = new Child(); - ����
		// Child �����̸� = new Parent(); - �Ұ���
		
		// Car Ÿ�� �迭 ����
		Car[] cars = new Car[3];
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		
		for(Car x : cars) {
			x.display();
			System.out.println("--------------------");
		}
		
		System.out.println();
		for (Car x : cars) {
			CarUtil.drive(x);
			System.out.println("--------------------");
		}
		

	} // end main()

} // end InheritMain06
