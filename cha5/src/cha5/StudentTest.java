package cha5;

public class StudentTest {
   // Ŭ������ ���, �����ϴ� �޼���  ���� �޼��� ���� - class/��ü�� ����ϱ� ���� �Լ�
	public static void main(String[] args) {
	
		// new Ű���� : (��ü /������/�ν��Ͻ�) �����ϴ� Ű���� 
		// ������ ������ Ÿ�� Student - �������� studentJi
		Student studentJi = new Student();
		
		// ��������  .�� ������ ���� �Լ� ��밡�� 
		// �޼��� ���� (Ŭ���� ����, ����ϱ�)
		studentJi.studentName = "����";
		studentJi.studentID = 1;
		studentJi.address = "����� ���ŵ�";
		
		Student studentKim = new Student();
		
		studentKim.studentName = "�达";
		studentKim.studentID = 2;
		studentKim.address = "����� ��õ��";
		
		studentJi.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentJi);
		System.out.println(studentKim);
	}
			
   // Ŭ������ ����ϱ� ����  ���� �޼��尡 �ش� Ŭ���� ���� ���� �� ������,�ٸ� Ŭ�������� �۵��� �� �ִ�.
			
}


