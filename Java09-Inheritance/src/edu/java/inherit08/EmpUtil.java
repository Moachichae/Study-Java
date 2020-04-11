package edu.java.inherit08;

public class EmpUtil {
	// Employee
	// |_Manager
	public static void printEmpInfo(Employee emp) {
		if(emp instanceof Manager) {
			Manager m = (Manager) emp; // ���� ����ȯ(casting)
			System.out.println("�̸� : " + m.getName());
			System.out.println("��å : " + m.getType());
		} else if(emp instanceof Employee) {
			System.out.println("�̸� : " + emp.getName());
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
	} // end printEmpInfo()
}// end EmpUtil
