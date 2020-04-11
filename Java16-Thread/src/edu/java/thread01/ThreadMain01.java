package edu.java.thread01;

// ������(Thread) : �ϳ��� �۾��� ���������� �����ϴ� ���� �ڵ�
// ��Ƽ ������ ���α׷� : 
// �ϳ��� ���α׷����� ���� ���� �����带 �����ϴ� ���α׷�
// (��) ä�� ���α׷� : ä�� + ���� ����

// �ڹٿ��� �����带 �����ϰ� ����ϴ� ��� 1 :
// 1. Thread Ŭ������ ��ӹ޴� ���ο� Ŭ������ ����(extends Thread)
// 2. ������ ���ο� Ŭ���� �ȿ��� run() �޼ҵ带 override
// -> run() : �����尡 �ؾ� �� ����� ����
// 3. ������ Ŭ������ �ν��Ͻ��� ����
// 4. ������ �ν��Ͻ����� start() �޼ҵ带 ȣ��
// -> �����尡 ������ �� �޸� ������ Ȯ��, �����층�� ���ؼ� ������ ���, �ʱ�ȭ
// -> �������� run() �޼ҵ尡 �ڵ����� �����

// 1. Thread Ŭ������ ��ӹ޴� ���ο� Ŭ���� ����
class MyThread extends Thread { // public class������ ��ӹ����� �ȵɱ� ?
	// ��� ����
	private String msg;
	
	// ������
	public MyThread(String msg) {
		this.msg = msg;
	}
	
	// 2. run() �޼ҵ带 override - �����尡 �ؾ��� ��ɵ��� ����
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + ":" + msg);
			try {
				sleep(1000); // 1�� ���� ���� ���� (1�ʴ� 1000millis)
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
	
	
	
}

public class ThreadMain01 {

	public static void main(String[] args) {
		/// 3. Thread�� ��ӹ޴� Ŭ����(My Thread)�� �ν��Ͻ� ����
		MyThread th1 = new MyThread("�ȳ�");
		
		// 4. ������ �ν��Ͻ����� start() �޼ҵ带 ȣ�� -> ������ ����
		th1.start();
		
		Thread th2 = new MyThread("Hello?"); // ������
		th2.start();
		
		// join() : �ش� �����尡 ����� ������ ��ٸ�
		try {
			th1.join();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		System.out.println("<< ���� ������ ���� >>"); // main() ����� �ڿ� Th1,Th2�� ����
		
		

	} // end main()

} // ThreadMain01










