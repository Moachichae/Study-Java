package edu.java.thread01;

// 쓰레드(Thread) : 하나의 작업을 순차적으로 진행하는 실행 코드
// 멀티 쓰레드 프로그램 : 
// 하나의 프로그램에서 여러 개의 쓰레드를 동작하는 프로그램
// (예) 채팅 프로그램 : 채팅 + 파일 전송

// 자바에서 쓰레드를 생성하고 사용하는 방법 1 :
// 1. Thread 클래스를 상속받는 새로운 클래스를 정의(extends Thread)
// 2. 정의한 새로운 클래스 안에서 run() 메소드를 override
// -> run() : 쓰레드가 해야 할 기능을 구현
// 3. 정의한 클래스의 인스턴스를 생성
// 4. 생성된 인스턴스에서 start() 메소드를 호출
// -> 쓰레드가 가져야 할 메모리 공간을 확보, 스케쥴링을 위해서 쓰레드 등록, 초기화
// -> 쓰레드의 run() 메소드가 자동으로 실행됨

// 1. Thread 클래스를 상속받는 새로운 클래스 정의
class MyThread extends Thread { // public class에서는 상속받으면 안될까 ?
	// 멤버 변수
	private String msg;
	
	// 생성자
	public MyThread(String msg) {
		this.msg = msg;
	}
	
	// 2. run() 메소드를 override - 쓰레드가 해야할 기능들을 구현
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + ":" + msg);
			try {
				sleep(1000); // 1초 동안 일을 멈춤 (1초는 1000millis)
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
	
	
	
}

public class ThreadMain01 {

	public static void main(String[] args) {
		/// 3. Thread를 상속받는 클래스(My Thread)의 인스턴스 생성
		MyThread th1 = new MyThread("안녕");
		
		// 4. 생성된 인스턴스에서 start() 메소드를 호출 -> 쓰레드 실행
		th1.start();
		
		Thread th2 = new MyThread("Hello?"); // 다형성
		th2.start();
		
		// join() : 해당 쓰레드가 종료될 때까지 기다림
		try {
			th1.join();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		System.out.println("<< 메인 쓰레드 종료 >>"); // main() 종료된 뒤에 Th1,Th2가 실행
		
		

	} // end main()

} // ThreadMain01










