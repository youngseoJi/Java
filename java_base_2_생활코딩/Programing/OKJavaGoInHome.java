import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
// ex) Elevator.java Ŭ���� �̿��Ͽ� Elevator ���α׷� �����ϱ�
import org.opentutorials.iot.Security;



// import Ư�� Ŭ���� ������� - Elevator

// �̹� �ִ� ���� Ȱ���Ͽ� ���α׷� ������ - �����ϱ� 

// ���α׷��� ���ؼ� ���� ���� �ڵ�ȭ�� �� ������ �˾ƶ�
public class OKJavaGoInHome {
	 
	public static void main(String[] args) {
//.
		// �ߺ����� / ������ �κ� ���� ���氡��
		String id = "JAVA APT 102";

		
		// 1. Elevator call : ���������� ��� ���

		// myElevator ������ Elevator ������ Ÿ�Կ� �ش�Ǵ� �����͸� ���� �� �ִ�.
		Elevator myElevator = new Elevator(id);
		
		// 1������ ���������� ������ ��� / ���
		myElevator.callForUp(1);
		
		
		// 2. Security off  : ���� ������ ���
		
		Security mySecutity = new Security(id);
		mySecutity.off();
		
		
		// 3. Light on : �ڵ� �������� ���
		
		Lighting hallLamp = new Lighting(id + " / HallLamp");
		hallLamp.on(); // �Ž� �� ����
		
		Lighting floorLamp = new Lighting(id + " / floorLamp");
		floorLamp.on(); // ���ĵ� ����
	}

}
