package edu.java.collection02;

import java.util.ArrayList;

class Student{
	// ��� ����
	private int stuNo;
	private String name;
	
	public Student(int stuNo, String name) {
		super();
		this.stuNo = stuNo;
		this.name = name;
	}
	// getter/ setter
	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {	
		String str = "��ȣ : " + stuNo + "\n"
				+ "�̸� : " + name;
		return str;
	}
	
	
	
} // end Student

public class ListMain02 {

	public static void main(String[] args) {
		Student[] I = new Student[3];
		// Student Ÿ���� ������ �� �ִ� ArrayList �ν��Ͻ� ����
		ArrayList<Student> list = new ArrayList<Student>();
		// index : ����Ʈ ������ ���� ��ȣ
		// element : ����Ʈ Ÿ�Կ� �´� ��ü�� ����
		
		// ���� �߰� : add(element)
		Student stu1 = new Student(1, "Kim");
		list.add(stu1);
		list.add(new Student(2, "Park"));
		
		// ���� �б� : get(index)
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================");
		// ���� ���� : set(index, element)
		list.set(0, new Student(3, "Choi"));
		for(Student s : list) {
			System.out.println(s);
		}
		
		System.out.println("==========================");
		// ���� ���� : remove(index)
		list.remove(0);
		for(Student s : list) {
			System.out.println(s);
		}
		
	} // end main()

} // end ListMain02

















