package loopex;

public class BreakEx {

	public static void main(String[] args) {

		/* break ��
		 * �ݺ������� break���� ������, ���̻� �ݺ��� ���������� ������ �ݺ��� Ż��
		 * �ڱ⸦ ���ΰ� �ִ�(���� �����) �ݺ����� Ż���Ѵ�.
		 */
		int sum = 0;
		int num = 1;
		
		while(true) {
			sum += num;
			
			// 100 ���� sum�� Ŀ����, �ڱ⸦ ���ΰ� �ִ� �ݺ����� Ż���Ѵ�.
			if (sum > 100)
				break;
			num++;
			
			}
			
			System.out.println(sum); // 105
			System.out.println(num); // 14
	}
	
}
