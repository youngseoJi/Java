package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		// �л� ���� : id, �̸� 
		Student studentJi  = new Student(1, "Ji");
		// �л��� ��� ���� �߰� : ����, ����
		studentJi.addSubject("����", 80);
		studentJi.addSubject("����", 40);
		
		// �л����� ��ȸ
		studentJi.showStudentInfo();
		
		System.out.println("=============�л�����===");
		Student studentBe  = new Student(2, "Be");

		studentBe.addSubject("����", 40);
		studentBe.addSubject("����", 100);
		studentBe.addSubject("��ȸ", 70);
		
		studentBe.showStudentInfo();
	}

}
