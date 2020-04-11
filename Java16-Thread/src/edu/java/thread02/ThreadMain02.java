package edu.java.thread02;

// �ڹٴ� ���� ����� ������� �ʱ� ������
// �ٸ� Ŭ������ �̹� ��ӹް� �ִ� ��쿡�� Thread Ŭ������ ��ӹ��� �� ����
// Runnable �������̽��� �����Ͽ� Thread�� ������ �� �ִ� ����� ����

// �ڹٿ��� �����带 �����ϰ� ����ϴ� ��� 2 : 
// 1. Runnable �������̽��� �����ϴ� Ŭ���� ����(implements Runnable)
// 2. ������ Ŭ�������� run() �޼ҵ带 override
// -> �����尡 �ؾ� �� ��� ����
// 3. ������ Ŭ����(Runnable ���� Ŭ����)�� �ν��Ͻ� ����
// 4. Runnable �ν��Ͻ��� �Ű������� �ؼ� Thread �ν��Ͻ� ����
// 5. Thread �ν��Ͻ����� start() �޼ҵ带 ȣ�� -> run() �ڵ� ȣ��


// 1. Runnable �������̽��� �����ϴ� Ŭ���� ����
class MyRunnable implements Runnable{
	private String msg;
	
	public MyRunnable(String msg) {
		this.msg = msg;
	}
	
	// 2. run() �޼ҵ� override
	@Override
	public void run() {	
		for (int i = 0; i < 100; i++) {
			System.out.println(i + ":" + msg);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
	
} // end MyRunnable

public class ThreadMain02 {

	public static void main(String[] args) {
		// 3. Runnable �����ϴ� Ŭ����(MyRunnable)�� �ν��Ͻ� ����
		MyRunnable r1 = new MyRunnable("r1");
		Runnable r2 = new MyRunnable("r2");
		
		// 4. Runnable �ν��Ͻ�(r1)�� �Ű������� �ؼ� Thread �ν��Ͻ� ����
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		
		// 5. ������ �ν��Ͻ�(th1)���� start() ȣ��
		th1.start();
		th2.start();
		
		System.out.println("<<<< ���� ������ ���� >>>>");
				

	} // end main()

} // end ThreadMain02



















