package loopex;

public class WhileEx {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		// �ݸ� ���� - ���ΰ�� ���ѹݺ�
		while(num <= 10) {
			sum += num;
			num++;
		}
		// false ������ �ܿ� while�� Ż��, {} ���� �ڵ� ���
		System.out.println("1~10���� ���� " + sum + "�Դϴ� .");	
	}

}
