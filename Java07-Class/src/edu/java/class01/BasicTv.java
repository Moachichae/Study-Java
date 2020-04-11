package edu.java.class01;

// Ŭ����(Class)
// - ������� �ϴ� ����� ����(�Ӽ�) �������� "��� ����"�� �����ϰ�.
//   ����� �������� ��ɵ��� "�޼ҵ�"�� �����ϴ�,
//   ������ ����� "������ Ÿ��"

public class BasicTv {
	// TV�� ������ �� ����(�Ӽ�, ����) => ��� ����(�ʵ�, ������Ƽ)
	boolean powerOn; // TV�� ���� ����(true : on, false : off)
	int channel;  //  TV�� ä�� ����
	int volume;   // TV�� �Ҹ�����
	
	// TV�� ������ �� ��� => �޼ҵ�
	// TV�� �Ѱų� ���� ����� �޼ҵ�
	public void turnOnOff() { // ���� tv�� ����������
		if(powerOn) {
			powerOn = false;
			System.out.println("TV�� �������ϴ�.");
		} else { // ���� tv�� ����������
			powerOn = true;
			System.out.println("TV�� �������ϴ�.");
		}
	} // end turnOnOff()
	
	// ä�� ���� ����� �޼ҵ�
	public void channelUp() {
		if(powerOn) { // TV�� ���� ������
			if(channel == 5) { // ���� ä���� ������ ä���̸�
				channel = 1;				
				} else {
					channel++;
				}
			System.out.println("channel up : " + channel);
		}
	} // end channerlUp()
	
	// ä�� ���� ����� �޼ҵ�
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
	
	// �Ҹ� ���� ����� �޼ҵ�
	public void volumeUp() {
		if (powerOn) {
			if(volume != 4) { // ���� �Ҹ��� 4�� �ƴϸ�
				volume++; 
			}
			System.out.println("volume up : " + volume);
		}
	} // end volumeUp()
	
	// �Ҹ� ���� ����� �޼ҵ�
	public void volumeDown() {
		if(powerOn) {
			if(volume !=0) { // ���� �Ҹ��� 0�� �ƴѰ��
				volume--;
			}
			System.out.println("volume down : " + volume);
		}
	} // end volumeDown()
	
	public void displayInfo() {
		System.out.println("--- TV ���� ���� ---");
		System.out.println("���� : " + powerOn);
		System.out.println("ä�� : " + channel);
		System.out.println("���� : " + volume);
	} // end displayInfo()
	
} // end BasicTv



















