package loopex;

public class ForEx {

	public static void main(String[] args) {
		/* ��ø �ݺ���
		* �ܺ� �ݸ� 1ȸ ���� -> ���� �ݸ� ó������ ������ ����
		*/
		
		int dan;
		int times;
		// �ܺ� �ݺ��� : 1 ���� 9�� ���� 
		for (dan =1; dan <= 9; dan ++) {
			// ���� �ݺ��� : 1 ���� 9���� �ݺ��ؼ� ��� �� +1 �� ���� ���Ѵ�.
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			// ���� �ݺ��� �����Ҷ����� ������ �ڵ� : ��ĭ ��� 
			System.out.println();
		}
	
	
	int dan2 = 2;
	int times2 = 1;
	// �ܺ� �ݺ��� : 1 ���� 9�� ���� 
	while (dan2 <= 9) {
		// �ʱⰪ���� �ʱ�ȭ �ʼ� (times2�� 9�� �Ǿ����� 1���� �ٽ� ��������Ѵ�.)
		times2 = 1;
		// ���� �ݺ��� : 1 ���� 9���� �ݺ��ؼ� ��� �� +1 �� ���� ���Ѵ�.
		while (times2 <= 9) {
			System.out.println(dan2 + "X" + times2 + "=" + dan2*times2);
			times2++; 
		}
		// ���� �ݺ����� ������ ����
		dan2++;
		// ���� �ݺ��� �����Ҷ����� ������ �ڵ� : ��ĭ ��� 
		System.out.println();
		}
	
	}
}
