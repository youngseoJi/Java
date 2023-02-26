import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.DimmingLights;



// ��� �߰��� Ŭ���� : �Է��� �ؽ�Ʈ ������ ���Եǰ� 
public class OKJavaGoInHomeInput {
	
	public static void main(String[] args) {

		// showInputDialog() : �˾�â �� -> �Է°� �ۼ� -> id : �׻� ������ ���� �ƴ� ����ڰ� �Է��� ������ ��ȯ�ǰ� ��.
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright");
		
		
		
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
		hallLamp.on(); // �Ž� �� Ű�� 
		
		Lighting floorLamp = new Lighting(id + " / floorLamp");
		floorLamp.on(); // ���ĵ� Ű�� 
		
		DimmingLights moodLamp = new DimmingLights(id + " / moodLamp");
		// ����� Ű�� - setBright ��� : ~% ���� �����ϵ��� 
		// String �� -> Double �� ����  Double.parseDouble(bright)
		moodLamp.setBright(Double.parseDouble(bright)); 
		// "10" �Է½�  -> 10 ����������   (10% ������� ������ ��� ����Ǵ� �� )
		moodLamp.on(); 
	}

}
