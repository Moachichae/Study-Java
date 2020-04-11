package edu.java.access11;

// �̱��� ������ ����(singleton design pattern)
// - Ŭ������ �ν��Ͻ��� ���� �ϳ��� ������ �� �ֵ��� �ۼ��ϴ� ���� ���
// 1. Ŭ���� �ڽ� Ÿ���� private static ������ ����
// 2. �����ڴ� private���� ����
// 3. public static �޼ҵ带 �����Ͽ� �ν��Ͻ��� ������ �� �ֵ��� ��

// - �̱��� ��� ����
// 1. ������ �޸� ������ �� �ν��Ͻ��� �ѹ� �����ϱ� ������ �޸� ���� ����
// 2. �̱��� Ŭ������ �ν��Ͻ��� ���� �ν��Ͻ��̹Ƿ� ������ ������ ����
// 3. ������Ǯ, ĳ��, ��Ʈ��ũ ����, DB ���� �� ���� ��ü�� ����ؾ� �ϴ� ��Ȳ���� ���

public class Captain {
	// ��� ����
	private String name;
	
	// 1. private static Captain ������ ����
	private static Captain instance = null;
	// 2. private ������
	private Captain() {}
	// 3. public static �޼ҵ带 �����Ͽ� �ν��Ͻ� ����
	public static Captain getInstance() {
	if (instance == null) {
		instance = new Captain();
	}
	return instance;
	}
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

} // end Captain
