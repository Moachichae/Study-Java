package edu.java.inherit02;

public class Person {
	// 멤버 변수
	private String name;
	
	// 생성 자
	public Person() {
		System.out.println("Person 생성자");
	}
	
	public Person(String name) {
		System.out.println("Person(name) 생성자");
	}
	
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 
} // end Person
