package array;

public class ArrayTEst {

	public static void main(String[] args) {
		
		// �迭 ���� : �ڷ���[] �迭�����̸� = new �ڷ���[����]
		int[] num1 = new int[3]; // or int numbers[] = new int[3];
		// ������ ����
		num1[0] = 1;
		num1[1] = 2;
		num1[2] = 3;
		
		for (int i = 0; i <num1.length; i++) {
			System.out.println(num1[i]); // 1 2 3
		}
		
		// �迭 �ʱ�ȭ : [] ���� �迭 �� ���� ���� �������, {}�� �迭�� ũ�� ����
		// {} ���� ���� �����̵ǰ� �װ��� �ʱ�ȭ �Ȱ�  
		// �ʱ�ȭ �Ǵ� ��ŭ, �޸𸮰� ������. (�޸� ũ��)
		int[] num2 = new int[] {0,1,2};
		
		System.out.println(num2.length); // 3
		 
		// �迭 �ʱ�ȭ : [] �迭�ȿ� �迭 ũ��/���� �����Ͽ� �ʱ�ȭ 
		int[] num3 = new int[5];
		System.out.println(num3.length); // 5
		
		// �ʱ�ȭ�Ǿ ���� 0, �迭�� ���������� �ʱ�ȭ�� ũ�� 5��
		for (int i = 0; i <num3.length; i++) {
			System.out.println(num3[i]); // 0 0 0 0 0
		}
	}

}
