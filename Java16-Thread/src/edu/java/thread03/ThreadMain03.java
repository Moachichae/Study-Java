package edu.java.thread03;

class MyRunnable implements Runnable{	
	
	// 2. run() �޼ҵ� override
	@Override
	public void run() {	
		for (int i = 0; i < 100; i++) {
			System.out.println("������!");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
	
} // end MyRunnable

public class ThreadMain03 {

	public static void main(String[] args) {
		// 1. Ŭ���� �ν��Ͻ� �����Ͽ� ������ start()
		Thread th1 = new Thread(new MyRunnable());
		th1.start();
		
		// 2. �͸� Ŭ������ ����Ͽ� ������ start();
		Thread th2 = new Thread(new Runnable() {	// ������ ����...		
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("������!");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {				
						e.printStackTrace();
					}
				}
				
			}
		});
		th2.start();
			
			
			
			// 3. ���� ǥ������ ����Ͽ� ������ start();
			new Thread(() -> { // ���� ���������ʰ� �ν��Ͻ��� ���...
				for (int i = 0; i < 100; i++) {
					System.out.println("����");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {				
						e.printStackTrace();
					}
				}
			}).start();	
			
			
				
		

					
				
				

	} // end main()

} // end ThreadMain03









