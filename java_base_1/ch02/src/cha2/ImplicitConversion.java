package cha2;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		/* �ڵ� ����ȯ 
		 * 1. ���� ������ ū���� ����/
		 * 2. �� ������ ������ �� ������ ���� ����*/
	
		byte bNum = 10;
		int num = bNum; // 10 
		
		System.out.println(num);
		
		
		// long 8byte = 10 ���ͷ� (4byte) ����
		long lNum = 10; 
		// float 4byte �Ǽ� =  10 ���ͷ� (4byte) ���� ����
		// -> �Ǽ� float �� �� �����ϱ⿡, ���� 10�� �Ǽ��� �ڵ� ����ȯ
		float fNum = lNum; // 10.0

		System.out.println(fNum);

		// 1. �������� ���� �Ǽ� + ���� -> float �Ǽ��� �ڵ� ����ȯ
		// 2. ������ ���� float ���� double �� ū Ÿ������ �ڵ� ����ȯ
		
		double dNum = fNum + num;
		
		System.out.println(dNum); // 20.0
	
		
	}

}
