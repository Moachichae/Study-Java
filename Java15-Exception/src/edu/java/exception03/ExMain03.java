package edu.java.exception03;

public class ExMain03 {

	public static void main(String[] args) {
		try {
			System.out.println("try ����");
			int[] array = new int[10];
//			array[13] = 100; // ���� �߻� -> catch�� �̵� 
			System.out.println(array[10]);
		} catch (Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage());
		}
		
		System.out.println("���α׷� ����");
		// ���� ������ try���� �������� �����ڰ� ���� if�� �ۼ�
		

	} // end main()

} // end ExMain03
