package edu.java.collection06;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionMain06 {

	public static void main(String[] args) {
		// TreeSet<String> ��ü ����
		TreeSet<String> set = new TreeSet<String>();
		
		
		// ������ ���� : add(element)
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		
		// TreeSet<E>�� ���
		// iterator() : �������� Iterator ��ü ����
		// descendinIterator() : �������� Iterator ��ü ���� 
		//		-> HashSet<E>�� �������� Iterator�� ����		
		
		// Iterator ��ü�� ����� ������ ���
		
		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	} // end main()

} // end CollectionMain06













