package assignment;

public class OperationEx2 {

	public static void main(String[] args) {

		/* ��������� 
		* ��Ģ���꿡 ���� : / * - + %
		* % �� ������ ���ϴ� ������ : ���� n�� �������� 0 ~ n-1 �����Ǽ�*/
		
		/* ���� ���� ������ (����) ++ -- 
		* 1��ŭ ���ϰų� ���� ����� 
		* ���� ��/�� ��ġ�� ���� ���� ����� �޶���*/
		
		// ���� �տ� ++(--) �ִ� ���
		int num1 = 10;
		//-> ����� �Ǳ����� +1 ���� ���ض�
		System.out.println(++num1); // 11
		
		// ���� �ڿ� ++(--)�ִ� ��� 
		int num2 = 10;
		//-> ����� �� �Ŀ�  
		System.out.println(num2++); // 10
		// +1 ���� ���ض�
		System.out.println(num2); // 11
		
		/* ���迬���� (����)
		 * ������ ����� true / false�� ��ȯ�� */
		
		System.out.println(4 > 3); // true 
		
		
		int num3 = 3;
		int num4 = 4; 
		boolean flag = (num4 < num3); // 4 < 3 ?
		System.out.println(flag); // false
		
		/* ��󿬻���  && , ||
		 * ������ ����� true / false�� ��ȯ�� 
		 * && : �Ѵ� true ������
		 * || : �� �� �ϳ���  true���� ��*/
		int num10 = 10;
		int i = 2;
		// 20 < 10 ? false �ڿ� ���� ������� �ʰ�, false ���� value�� ���Եȴ�.
		boolean value = (((num10 = num10 + 10) < 10) && ((i-11+2) > 10 ) );
		System.out.println(value); // false
		System.out.println(num10); // 20
		System.out.println(i); // 2

		
	}

}
