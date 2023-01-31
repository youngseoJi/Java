package cha2;

public class ExplicitConversion {

	public static void main(String[] args) {

		
		/* ������ ����ȯ 
		 * ��ȯ�Ǵ� �ڷ����� ����ؾ� �� 
		 * �ڷ��� �ս��� �߻��� �� ����*/
		
		// 1byte�� �����ʹ� -128~127 = iNum�� �� 1000 
		int iNum = 1000;
		
		// int -> byte �� ��ȯ
		// ū������ ���� ���� ������ �� ���, ���� �սǵ�
		byte bNum = (byte)iNum; 
		
		System.out.println(iNum); // 1000
		System.out.println(bNum); // -24
		
		
		
		// double �Ǽ�  
		double dNum = 3.14;
		// int ������ ����ȯ -> �Ҽ� �� ���� ����, ������ ��ȯ 
		iNum = (int)dNum; 
		
		System.out.println(dNum); // 3.14
		System.out.println(iNum); // 3

		
		// float �Ǽ�
		float fNum = 0.9F;
		
		// ���� ����ȯ �� �� ������ �� ��� : int�� ���� ����ȯ �� - > ���� ���� �� -> int num1 �������� ����
		// 3 + 0 = 3 
		int num1 = (int) dNum + (int) fNum;
		// ������  ����� ����ȯ �� ��� : ���� ���� ��  -> int�� ����ȯ �� -> int num2 �������� ����
		// 3.14 + 0.9 = 4.23 -> 4    
		int num2 = (int) (dNum + fNum);
		
		System.out.println(num1); // 3
		System.out.println(num2); // 4
	}

}
