package ifex;

public class SwitchCase2 {

	public static void main(String[] args) {

		int month = 10; 
		int day;
		
		switch (month) {
		// case�� ������ ���� ��� ���ؼ� �� �� �ִ�.
		case 1: case 3: case 5:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4: case 6: 
			day = 30;
			break;
		default:
			day = 0;
//			break; �������� 
		}
		System.out.println(month + "���� " + day + "�� ���� �ֽ��ϴ�. ");
	}

}
