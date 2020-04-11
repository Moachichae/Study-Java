package edu.java.thread03;

class MyRunnable implements Runnable{	
	
	// 2. run() 메소드 override
	@Override
	public void run() {	
		for (int i = 0; i < 100; i++) {
			System.out.println("쓰레드!");
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
		// 1. 클래스 인스턴스 생성하여 쓰레드 start()
		Thread th1 = new Thread(new MyRunnable());
		th1.start();
		
		// 2. 익명 클래스를 사용하여 쓰레드 start();
		Thread th2 = new Thread(new Runnable() {	// 생성자 공부...		
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("쓰레드!");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {				
						e.printStackTrace();
					}
				}
				
			}
		});
		th2.start();
			
			
			
			// 3. 람다 표현식을 사용하여 쓰레드 start();
			new Thread(() -> { // 변수 생성하지않고 인스턴스만 사용...
				for (int i = 0; i < 100; i++) {
					System.out.println("람다");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {				
						e.printStackTrace();
					}
				}
			}).start();	
			
			
				
		

					
				
				

	} // end main()

} // end ThreadMain03









