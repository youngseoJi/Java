package loopex;

public class WhileEx {

	public static void main(String[] args) {

		// �ݺ��� while ��
		int num = 1;
		int sum = 0;
		
		// while(�ݺ� ���ǽ�) :  ���ΰ�� ���ѹݺ�
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		// false ������ �ܿ� while�� Ż��, {} ���� �ڵ� ���
		System.out.println("1~10���� ���� " + sum + "�Դϴ� .");	
	
		

		
		
		// �ݺ��� do .. while��
		int num2 = 1;
		int sum2 = 0;
	
		// do : �� �ѹ� ���� �Ѵ�.
		do {
			sum2 += num2;
			num2++;
		}
		// while(�ݺ� ���ǽ�) :   ���ΰ�� ���ѹݺ�
		while(num2 < 1 );
		// false ������ �ܿ� while�� Ż��, {} ���� �ڵ� ���
		System.out.println(sum2 + "�Դϴ� .");	 // 1�Դϴ� .

	

		int num3 = 1;
		int sum3 = 0;
		while(num3 < 1) {
			sum3 += num3;
			num3++;
		}
		// false ������ �ܿ� while�� Ż��, {} ���� �ڵ� ���
		System.out.println( sum3 + "�Դϴ� ."); // 0�Դϴ� .


	}
}