import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
// ex) Elevator.java Ŭ���� �̿��Ͽ� Elevator ���α׷� �����ϱ�
import org.opentutorials.iot.Security;



// ��� �߰��� Ŭ���� : �Է��� �ؽ�Ʈ ������ ���Եǰ� 
public class OKJavaGoInHomeInput {
	
	public static void main(String[] args) {

		// id : ������ ���� �ƴ� �Է��� ������ ��ȯ�ǰ� ��.
		String id = JOptionPane.showInputDialog("Enter a ID");
		
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
