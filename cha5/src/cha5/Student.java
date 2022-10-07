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
	
	// �ڹ� �����Ϸ��� �����ڰ� �ϳ��� �������, ����Ʈ �����ڸ� �ڵ� ������ (�Ű������� X)
	// -> public Student(){}
	// ���� ����Ʈ �����ڸ� �����ص��ȴ�.
	public Student() {}
	
	// �Ű������� �ʿ��� ���� �����ڸ� ���� ������ش�.
	public Student(int id, String name, String address) {
		studentID = id;
		studentName = name;
	}
	
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
