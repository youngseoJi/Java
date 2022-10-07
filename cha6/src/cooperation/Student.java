package cooperation;

// ��� ����(member variable)�� �޼ҵ� �ۿ��� ����� ����

// �л� Ŭ����
public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		// ��� ����                      // ��������
		this.studentName = studentName;
		this.money = money;
	}
	
	// �л��� ������ Ż �� ȣ�� �޼ҵ� (��ȯ�� ���� �Լ�) - �Ű����� (������ ���� �ν��Ͻ�)
	public void takeBus(Bus bus) {
		// busŬ������ .take �Լ� : ��� 1000�� + �ǰ�, �°��� +1 �Ǵ� �Լ� 
		bus.take(1000);
		// ž�º� 1000���� �����Ѵ�. 
		money -= 1000;
	}
	
	// �л��� ����ö Ż �� ȣ�� �޼ҵ� (��ȯ�� ���� �Լ�) - �Ű����� (������ ���� �ν��Ͻ�)
		public void takeSubway(Subway subway) {
			// subwayŬ������ .take �Լ� : ��� 1500�� + �ǰ�, �°��� +1 �Ǵ� �Լ� 
			subway.take(1500);
			// ž�º� 1500���� - �����Ѵ�. 
			money -= 1500;
			
		}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����" + money + "�� �Դϴ�");
	}
}
