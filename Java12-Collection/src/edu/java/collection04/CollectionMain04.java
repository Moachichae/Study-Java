package edu.java.collection04;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectionMain04 {

	public static void main(String[] args) {
		
		// ����/���� ���� �Է� �޾Ƽ� Score ��ü ����
		Scanner sc = new Scanner(System.in);			
		
		
		
		List<Student> list = new LinkedList<Student>();
		for(int i = 0; i < 3; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			String name = sc.nextLine();
			System.out.println("���������� �Է��ϼ���");
			int english = sc.nextInt();
			sc.nextLine();
			System.out.println("���������� �Է��ϼ���");
			int math = sc.nextInt();
			sc.nextLine();	
			Score scores = new Score(english,math);	
			Student student = new Student(name, scores);
			
			list.add(student);
		}
		
		
		for(int i = 0; i < list.size(); i++) { // ����
			System.out.println("--- �л�["+i + " ]����---" + "\n" + list.get(i));
		}
		
		for(int i = 0; i < list.size(); i++) { // ������
			System.out.println("--- �л�["+i + " ]����---");
			System.out.println("�̸� : " + list.get(i).getName());
			System.out.println("���� : " + list.get(i).getScore().getMath());
			System.out.println("���� : " + list.get(i).getScore().getEnglish());
		}
		
		sc.close();	
		
		
		// ���� : set()
		Score score = new Score(100, 100);
		Student stu = new Student("�Ѹ�",score);
		list.set(2, stu);
		
		// 1�� �ε��� �л��� ���� ����
		list.get(1).setName("��ġ");
		list.get(1).getScore().setMath(99); // ���� ���� ����
		list.get(1).getScore().setEnglish(88); // ������������
		
		
		System.out.println("--- ������ ---");
		for(int i = 0; i < list.size(); i++) { // ������
			System.out.println("--- �л�["+i + " ]����---");
			System.out.println("�̸� : " + list.get(i).getName());
			System.out.println("���� : " + list.get(i).getScore().getMath());
			System.out.println("���� : " + list.get(i).getScore().getEnglish());
		}
		
		
		// ���� : remove()
		list.remove(1);
		System.out.println("--- ������ ---");
		for(int i = 0; i < list.size(); i++) { // ������
			System.out.println("--- �л�["+i + " ]����---");
			System.out.println("�̸� : " + list.get(i).getName());
			System.out.println("���� : " + list.get(i).getScore().getMath());
			System.out.println("���� : " + list.get(i).getScore().getEnglish());
		}
		
		
		
		
		
		// �̸�, Score ��ü�� Students ��ü�� 3�� ����
		// LinkedList �����Ͽ� Student ������ ����(add)
		
		// LinkedList�� ������ �˻�(get), ����(set), ����(remove) �ϱ�
		// �˻� ����)
		// --- �л�[0] ���� ---
		// �̸� : Kim
		// ���� : 100
		// ���� : 100
		
		// ���� �� ������ ������ �ε����� �����ͷ� ����
		

	} // end main()

	

} // end Collection04
