package edu.java.collection07;

import java.util.Set;
import java.util.TreeMap;

// List<E>, Set<E> : �� ���� Ÿ���� �����͸� ������ �� �ִ� Collection

// Map<K,V> : Key-Value ������ �����͸� �����ϴ� ����

//	1. Key�� �ߺ����� �ʴ� ���� ���� ����
//	2. Value�� �ߺ��� ���� ���� ����
//	3. �˻�, ����, ������ �� Key���� �����

// Map<K, V>
// |_HashMap<K,V>, TreeMap<K,V>

// HashMap<K, V> : �˻��� ������ �ϱ� ���� Hash �˰����� ����� Map
// TreeMap<K, V> : ������ ������ �ϱ� ���� Tree �˰����� ����� Map

public class CollectionMain07 {

	public static void main(String[] args) {
		// TreeMap<Integer, String> ��ü ����
		TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		
		// Map<k, V>�� ������ ���� : put(key, value)
		map.put(10, "�̽¿�");
		map.put(16, "�����");
		map.put(22, "�̰���");		
		System.out.println(map); // value �������� ���� �ߺ���(key) ������� �ڿ� ���� ���� ���� 
		
		System.out.println();
		// Map<K, V>�� ������ �ϳ� �˻� : get(key)
		// - �ش� key ���� value�� ����
		System.out.println(map.get(10));
		System.out.println(map.get(22));
		
		System.out.println();
		// Map<K, V>���� �����͸� ���� : put(key, value)
		map.put(10, "�躴��");
		System.out.println(map.get(10));
		System.out.println(map);
		
		System.out.println();
		// Map<K, V>���� �����͸� ���� : remove(key)
		map.remove(10);
		System.out.println(map);
		
		System.out.println();
		// Map<K, V>���� key��θ� �̷���� Set�� ���� : keySet()
		Set<Integer> keySet = map.keySet();	// �������� Ű set
//		map.descendingKeySet(); // �������� Ű set
		
		System.out.println(keySet);
		for(Integer key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		
	
	} //end main()

} // end CollectionMain07














