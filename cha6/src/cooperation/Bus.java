package cooperation;

// ���� Ŭ����
public class Bus {

	int busNumber; // ������ȣ
	int passengerCount; // �°���
	int money; // ������
	
	// ���� (�Ű����� ������ȣ)
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// �°��� �� �� �¿��� �� ȣ��Ǵ� �޼ҵ� (�Ű����� ��)
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	// ����
	public void showInfo() {
		System.out.println("����" + busNumber + "���� �°���" + passengerCount + "�� �̰�, " + "������ " + money + "�� �Դϴ�.");
	}

}
