package cooperation;

// ����ö Ŭ����
public class Subway {

	int lineNumber; // ����ö ���� ��ȣ
	int passengerCount; // �°���
	int money; // ����ö Ž�� ���
	
	// ���� (�Ű����� ������ȣ)
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// �°��� �� �� �¿��� �� �޴� ��, �°� �� ���� �޼ҵ� (�Ű����� ��)
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	// �������� �޼ҵ�
	public void showInfo() {
		System.out.println("����ö " + lineNumber + "ȣ�� �°��� " + passengerCount + "�� �̰�, " + "������ " + money + "�� �Դϴ�.");
	}

}
