package edu.java.class01;

// 클래스(Class)
// - 만들고자 하는 대상의 상태(속성) 정보들을 "멤버 변수"로 선언하고.
//   대상이 가져야할 기능들을 "메소드"로 정의하는,
//   새로이 만드는 "데이터 타입"

public class BasicTv {
	// TV가 가져야 할 상태(속성, 성질) => 멤버 변수(필드, 프로퍼티)
	boolean powerOn; // TV의 전원 상태(true : on, false : off)
	int channel;  //  TV의 채널 정보
	int volume;   // TV의 소리정보
	
	// TV가 가져야 할 기능 => 메소드
	// TV를 켜거나 끄는 기능의 메소드
	public void turnOnOff() { // 만약 tv가 켜져있으면
		if(powerOn) {
			powerOn = false;
			System.out.println("TV가 꺼졌습니다.");
		} else { // 만약 tv가 꺼져있으면
			powerOn = true;
			System.out.println("TV가 켜졌습니다.");
		}
	} // end turnOnOff()
	
	// 채널 증가 기능의 메소드
	public void channelUp() {
		if(powerOn) { // TV가 켜져 있으면
			if(channel == 5) { // 현재 채널이 마지막 채널이면
				channel = 1;				
				} else {
					channel++;
				}
			System.out.println("channel up : " + channel);
		}
	} // end channerlUp()
	
	// 채널 감소 기능의 메소드
	public void channelDown() {
		if(powerOn) {
			if(channel == 1) {
				channel = 5;
			} else {
				channel--;
			}
			System.out.println("channel down : " + channel);
		}
	} // end channelDown()
	
	// 소리 증가 기능의 메소드
	public void volumeUp() {
		if (powerOn) {
			if(volume != 4) { // 현재 소리가 4가 아니면
				volume++; 
			}
			System.out.println("volume up : " + volume);
		}
	} // end volumeUp()
	
	// 소리 감소 기능의 메소드
	public void volumeDown() {
		if(powerOn) {
			if(volume !=0) { // 현재 소리가 0이 아닌경우
				volume--;
			}
			System.out.println("volume down : " + volume);
		}
	} // end volumeDown()
	
	public void displayInfo() {
		System.out.println("--- TV 현재 상태 ---");
		System.out.println("전원 : " + powerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
	} // end displayInfo()
	
} // end BasicTv



















