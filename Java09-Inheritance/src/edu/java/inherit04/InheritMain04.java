package edu.java.inherit04;

public class InheritMain04 {

	public static void main(String[] args) {
		Animal animal = new Animal("�ֿϵ���");
		animal.speak();
		
		System.out.println();
		Dog dog = new Dog("�ٵ���", "�ð��ں���");
		dog.speak();
		
		System.out.println();
		Cat cat = new Cat();
		cat.speak();

	} // end main()

} // end InheritMain04
