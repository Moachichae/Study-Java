package edu.java.file01;

import java.util.Scanner;

// ���α׷� < === InputStream < === �Է���ġ(Ű����, ���콺, ����, ...)
// ���α׷� === > OutputStream === > �����ġ(�����, ��������, ������, ����, ...)

public class FileMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// in : InputStream Ŭ���� �ν��Ͻ�
		// �ܺ� �Է���ġ(Ű����, ���콺)�κ��� �����͸� �о�� �� �ִ� ���
		
		System.out.print("�׽�Ʈ");
		// out : PrintStream Ŭ������ �ν��Ͻ�
		// PrintStream�� OutputStream Ŭ������ ���� Ŭ����
		// ����� �ܼ�ȭ������ �����͸� ����ϴ� ���
		sc.close();
	} // end main()

} // end FileMain01()













