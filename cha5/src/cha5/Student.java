package cha5;

// Ŭ���� �����ϱ� : �л�
// class(�����) class�� {}
// class �� : �� �ձ��� �빮�� , �޼ҵ�� : �ҹ���
public class Student {
	
	// ���� ����
	int studentID; 		// �л� �ĺ���
	String studentName; // �л��̸�
	int grade; 			// �г�
	String address; 	// �ּ�
	
	// �޼��� �ļ� - ��ȯ���� ���� ��� void�� ����
	public void showStudentInfor() {
		System.out.println(studentName  + " , " + address); 
	}
	
	// ��ȯ���� �ִ� ��� ���� Ÿ���� ����
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
