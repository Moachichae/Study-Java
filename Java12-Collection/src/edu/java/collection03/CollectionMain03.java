package edu.java.collection03;

import java.util.LinkedList;
import java.util.List;

// Collection<E> : �ڷ�(������)�� �����ϱ� ���� generic Ŭ����
// |_LIST<E>, Set<E>

// List<E> :
//	1. �ڷ���� ����Ǵ� ������ �߿� -> �ε��� ���
// 	2. �ߺ��� ������ ������ ���

// List<E>
// |_ArrayList<E>, LinkedList<E>

// ArrayList<E>
//	1. ���������� �迭 �ڷ� ������ ���
// 	2. ���� �뷮�� �ø��µ� ���� �ð��� �ҿ�� - ����
//	3. ����� �����͸� �����ϴµ� ���� �ð��� �ҿ�� - ����
//	4. �����͸� ����(�˻�)�� �� �ſ� ���� - ����

// LinkedList<E>
//	1. ���������� Liked List �ڷᱸ���� ���
//	2. ���� �뷮�� �ø��� ������ �ſ� ���� - ����
//	3. ����� �����͸� �����ϴ� ������ �ſ� ���� - ����
//	4. �����͸� ����(�˻�)�ϴ� �ð��� �ſ� ���� - ����

// ArrayList<E>, LinkedList<E> ���� ���Ǵ� �޼ҵ�� :
//	add(element), get(index), set(index, element), remove(index)

public class CollectionMain03 {

	public static void main(String[] args) {
		// String�� ������ �� �ִ� LinkedList ��ü ����
		List<String> list = new LinkedList<String>(); // ������
		
		list.add("��ſ�");
		list.add("�ָ�");
		list.add("��������!");
		list.add("��ø Ŭ���� �����Ͻñ���~");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		list.set(3, "���� ����!!");
		System.out.println("--- ���� �� ---");
		for(String name : list) {
			System.out.println(name);
		}
		
		list.remove(3);
		System.out.println("--- ���� �� ---");
		for(String name : list) {
			System.out.println(name);
		}
		
	} // end main()

} // end CollectionMain03














