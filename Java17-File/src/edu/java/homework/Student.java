package edu.java.homework;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private int math;
	private int eng;
	
	public Student(String name, int math, int eng) {
		this.name = name;
		this.math = math;
		this.eng = eng;
	}
	
	public void displayInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + math);
		System.out.println("���� : " + eng);
	}
	
	
	
} // end Student

