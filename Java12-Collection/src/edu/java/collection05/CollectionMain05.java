package edu.java.collection05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Collection<E>
// |_Set<E>
//	|_HashSet<E>,TreeSet<E>

// Set<E> :
//	1. �������� ���� ������ �߿����� ���� -> �ε����� ����
//	2. �ߺ��� �������� ������ ������� ����
//	��) {1, 2, 2, 3, 3, 3} = {1, 2, 3}

// HashSet<E> : �˻��� ������ �ϱ� ���� Hash �˰����� ����� Set
// TreeSet<E> : ������ ������ �ϱ� ���� Tree �˰����� ����� Set


public class CollectionMain05 {

	public static void main(String[] args) {
		// HashSet<Integer> ��ü ����
		Set<Integer> set = new HashSet<Integer>(); // ������
		
		// Set�� ������ ���� : add(element)
		set.add(300);
		set.add(200);
		set.add(100);
		set.add(200);
		System.out.println("Set size : " + set.size());
		
		// Set<E>�� �ε����� �����͸� �о�� �� �ִ� get() �޼ҵ带 �������� ����
		for (Integer x : set) { 
			System.out.println(x); // Set�� ����ϸ� �ڵ����� ���ı��� ����
		}
		
		System.out.println();
		// Iterator(�ݺ���)�� ����� ������ �˻�
		// - Iterator �޼ҵ�
		// iterator() : Iterator ��ü�� ����
		// hasNext() : Iterator ��ü�� ����Ű�� ��ġ��
		//				���Ұ� �ִ� �� (true), ���� ��(false)�� �����ϴ� �޼ҵ�
		// next() : Iterator ��ü�� ����Ű�� ��ġ�� ���� ��ġ�� �̵��ϰ�,
		//			���� ����Ű�� �ִ� ���� �����ϴ� �޼ҵ�
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println("���� ����? " + itr.hasNext() + " ������: "+ itr.next());
		}
		// Iterator �������̽� : �÷��� �����ӿ�ũ�� ǥ�� �������̽�
		List<Integer> list = new ArrayList<Integer>();
		list.iterator();
		
		
		System.out.println();
		// Set<E>�� ���Ҹ� ���� : remove(element)
		// �ε����� �ƴ϶� ������ ����
		set.remove(300);
		System.out.println("--- ���� �� ---");
		for (Integer x: set) {
			System.out.println(x);
		}
		
		
		
		// Set<E>�� �ε����� ���� ������,
		// ������ ������ ���� set(index,  element) �޼ҵ带 �������� ����
		// ������ ���� => ������ ����(remove) + ������ �߰�(add)
		set.remove(200);
		set.add(500);
		System.out.println("--- ���� �� ---");
		for(Integer x : set) {
			System.out.println(x);
		}
		
	} // end main()

} // end CollectionMain05
















