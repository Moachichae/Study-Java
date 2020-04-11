package edu.java.access01;

// ���� ���� ���ľ�(Access Modifier)
// 1. ���� : private, (package), protected, public
// 2. ��� :
//	1) �ɹ� ������ ���� ���� ������ ����
//	2) �޼ҵ忡 ���� ���� ������ ����
//	3) �����ڿ� ���� ���� ������ ����
//	4) Ŭ������ ���� ���� ������ ����(packager, public�� ��� ����)
// 3. �ǹ�: 
//	1) private : ����(����)�� Ŭ���� �ȿ����� ���� ����(���)�� ����
//	2) (package) : ���� ��Ű���� �ִ� Ŭ�����鿡�� ���� ����(���)�� ����
//	3) protected : ���� ��Ű���� �ְų� ��ӹ޴� Ŭ�����鿡�� ���� ����(���) ����
//	4) public : ��𼭵��� ���� ����(���) ����
//4. ��� ���� : < private < (package) < protected < public 

public class Test01 { // Test01 Ŭ������ ��𼭵� ���� ����
	// ��� ����
	private int n1; // Ŭ���� ���ο��� ���
	int n2;			// (packager) ���ο��� ���
	protected int n3; // ���� ��Ű�� Ȥ�� ��ӹ��� Ŭ�����鿡�� ���
	public int n4; // ��𼭵��� ���
	
	// �޼ҵ�
	public void display() {
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		System.out.println("n4 = " + n4);
	} // end display()
	
}
