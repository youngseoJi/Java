package cha5;

// Ŭ���� �����ϱ� : �л�
// class(�����) class�� {} 
public class Student {
	
	// ���� ����
	int studentID; // �л� �ĺ���
	String studentName; // �л��̸�
	int grade; // �г�
	String address; // �ּ�
	
	// �޼��� �ļ�
	public void showStudentInfor() {
		System.out.println(studentName  + " , " + address); 
	}
	
	// Ŭ������ ����ϱ� ����  ���� �޼��尡 �ش� Ŭ���� ���� ���� �� ������,�ٸ� Ŭ�������� �۵��� �� �ִ�.
/*	// ���� �޼��� (�Լ�) ���� : �ش� Ŭ������ �����ϱ� ���� �޼���
	public static void main(String[] args) {
		
		Student studentJI= new Student();
		studentJI.studentName = "����";
		studentJI.address = "����� ���ʱ�";
		
		// �޼��� ���� (Ŭ���� ����, ����ϱ�)
		studentJI.showStudentInfor();
	}
	*/
	
	
}
