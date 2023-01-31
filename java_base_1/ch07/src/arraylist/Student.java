package arraylist;

import java.util.ArrayList;

// �л� Ŭ����
public class Student {

	private int stID; // �ĺ���
	private String stName; // �̸�
	private ArrayList<Subject> subList; // �л��� ��� ����� - �迭

	// �л� ���� �Լ� - �ʼ� �Ű�����  �ĺ���, �̸�
	public Student(int stID, String stName) {
		// this -> Student Ŭ���� ����Ŵ
		this.stID = stID;
		this.stName = stName;
		
		// ArrayList ���� - Subject �ּҸ� �����ִ�.
		subList = new ArrayList<Subject>();
	}
	
	// �������� ���� �߰� �Լ� - �ʼ� �Ű����� �̸�, ����
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		// subject ArrayList �迭�� ������ �߰�
		subList.add(subject);
	}
	
	// ������ ���� ���� ���� �Լ� - �ʼ� �Ű����� 
	public void showStudentInfo() {
		
		int total = 0;
		for(Subject subject : subList) {
			//  Ư�� �л��� ���� ���ϱ�  - �� �������� �ݺ��� ���������� �����ֱ�
			total += subject.getScorePoint();
			// �� ���� ����
			System.out.println("�л� " + stName + "��" + subject.getName() + "���� ������" + subject.getScorePoint() + "�Դϴ�.");
		}
		// ���� 
		System.out.println("�л�" + stName + "�� ������ " + total + "�Դϴ�.");
		
	}
}
