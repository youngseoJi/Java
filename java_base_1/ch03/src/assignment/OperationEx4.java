package assignment;

public class OperationEx4 {

	public static void main(String[] args) {
		
		/* ���մ��Կ�����
		 * ���Կ����ڿ� �ٸ������ڸ� �Բ� ����� ����*/
		int num1 = 10;
		// 1�� ���� �� num1�� ����
		System.out.println(num1 += 1); // 11
		// 10���� ���� �� �������� num1�� ����
		System.out.println(num1 %= 10); // 1
		
		num1 -= 1; // num1 = num1 - 1 
		System.out.println(num1); // 0
		
		/* ���ǿ����� - ���׿�����
		 * ���ǽ��� ����� ���� ��� ? : ���� ���� ���, ������ ��� : �ڿ� �� ��� */
		
		int num = (5 < 3) ? 10 : 20;
		System.out.println(num); // 20	
		
		
		}

}
