package edu.java.interface06;

// ��� : IS - A ���谡 ������ ��
// - ����Ʈ TV�� TV�̴�. (SmartTV is a TV)
// - class SmarTv extends BasicTv{...}

// ����(�������̽�) : HAS-A ���谡 ������ ��
// - TV�� �������� ������ �ִ�. (TV has a remote controller)
// - class BasicTV implements RemoteControl {...}

// �������̽� Ȱ�� : �߻� �޼ҵ常 ����Ͽ� Ȱ��
public interface RemoteControl {
	public abstract void turnOn();
	public abstract void turnOff();
}
