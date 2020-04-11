package edu.java.file11;

import java.io.File;

// File Ŭ���� : 
//      ����(txt, doc, mp4, jpg, png, ...) ��ü��
//		���丮(����) ��ü�� �ٷ�� ���� Ŭ����
// File Ŭ������ �ν��Ͻ� ���� : new File();
//		�޸�(��)�� File Ŭ������ �ν��Ͻ��� �����Ѵٴ� �ǹ�
//		���� �ϵ��ũ�� �ִ� �������� ����/����(���丮)�� �����ϴ� ���� �ƴ�
//		���� ����/������ ����� ���ؼ��� File Ŭ������ �޼ҵ带 ȣ���ؾ� ��

// ����(���丮)�� ��� : ���� ���, ��� ���
// ���� ��� : ��Ʈ(C:\, D:\)���� ����(����)�� ��ġ���� ��ü �̸�
//		(��) C:\Study\JavaClass\
// ��� ��� : ���� �۾� ���丮�� �������� ����(����)�� ��� �ִ� �� ǥ��
//		(��) temp/test.txt
//		.: ���� ���丮(����)
//		..: ���� ���丮(����)

// ���� ����(file separator) - �ü��(OS)���� �ٸ��� ���
//		MS Windows - \ ���
//		Unix, Linux, Android, ... - / ���
// �ڹٿ����� File.separator��� ������ ����
// -> �ü���� �´� ���� �����ڸ� ����

public class FileMain11 {
	public static final String TEST_DIR1 = "C:\\test1"; // ���� ���  '\'Ư���������
	public static final String TEST_DIR2 = "test2"; // ��� ���
	public static final String TEST_DIR3 =
			"C:" + File.separator + "Study" + File.separator + "test3";
	

	public static void main(String[] args) {
		System.out.println(TEST_DIR1);
		System.out.println(TEST_DIR2);
		System.out.println(TEST_DIR3);
		
		// ����, ����(���丮)�� �ٷ�� ���� ��ü
		File f = new File(TEST_DIR3);
		//exists() : ����, ������ �����ϴ� �� (true), �ƴ� �� (false)�� ����
		if (!f.exists()) { // ����, ������ ���� ���
			System.out.println("������ �����ϴ�");
			// mkdir() : ���丮�� �����ϴ� �޼ҵ�. �����ϸ� true, �����ϸ� false ����
			if(f.mkdir()) {
				System.out.println("���� ���� ����");				
			} else {
				System.out.println("���� ���� ����");
			}
		} else { // ����, ������ �ִ� ���
			System.out.println("������ �̹� �����մϴ�.");
		}

	} // end main()

} // end FileMain11













