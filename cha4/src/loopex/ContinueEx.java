package loopex;

public class ContinueEx {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			
			// Ȧ���� ��� continue�� ����
			// continue�� : ������ �ݺ����� �������� �ʰ� Ż���Ѵ�.
			if((num % 2) == 1) {
				continue;
			}
			total += num;
		}
		System.out.println(total); //2550 
	}

}
