package edu.java.collection01;

import java.util.ArrayList;

public class ListMain01 {

	public static void main(String[] args) {
		int[] list1 = new int[3];
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("����Ʈ ũ�� : " + list.size());
		
		// ArrayList�� ����(element) �߰� : add() �޼ҵ� ���
		list.add(100); // index = 0
		list.add(200); // index = 1
		list.add(300); // index = 2
		list.add(400); // index = 3
		
		// ArrayList�� �ִ� ���� ����(�б�) : get(index)�޼ҵ� ���
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println();
		
		// for (����Ÿ�� �����̸� : �迭 �Ǵ� ����Ʈ�̸�){...}
		for(Integer n : list) {
			System.out.println(n);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		// ArrayList���� Ư�� �ε����� ���Ҹ� ���� : set(index, value)
		list.set(0, 1);
		list.set(2, 123456);
		for(Integer n : list) {
			System.out.println(n);
		}
		
		System.out.println();
		// ArrayList���� Ư�� �ε����� ���Ҹ� ���� : remove(index)
		list.remove(2);
		System.out.println("size = " + list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
	} // end main()

} // end ListMain01

















