package ifex;

public class SwichCase {

	public static void main(String[] args) {

		int rank = 1;
		char medal;

		switch(rank) {
		// ��� 1�� true�� ��� ( �޴��� 'G' �� ��� )
		case 1: medal = 'G';
		// break�� ������ �ش� �� ��� (G ���)
				break;
		case 2: medal = 'S';
				break;
		case 3: medal = 'B';
				break;
		// default �� -> ��� case ��쿡 false�� ��� ���
		default: medal = 'A';
//		break; ��������  
		}
		System.out.println(rank +"�� �޴��� ������ " + medal + "�Դϴ�. ");
	}

}
