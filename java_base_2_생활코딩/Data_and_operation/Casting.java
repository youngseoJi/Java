
// ������ Ÿ���� ��ȯ
public class Casting {

	public static void main(String[] args) {

		// �Ǽ�
		double a = 1.1;
		// ���� �ս��� ���⿡ �ڵ�����ȯ�� �ȴ�.
		// int ���� 1�� double �Ǽ������� �ڵ� ��ȯ��
		double b = 1;
		// double b = (double)1;
		System.out.println(b); // 1.0
	
//		int c = 1.1;  -- ���� �߻�   �Ǽ� 1.1�� ���� 1�� ��ȯ�Ѵٸ� 0.1 �ս��� �����Ǳ⿡
		
		double d = 1.1;  
		
		
		int e = (int) 1.1;  
		System.out.println(e); // 1
		
		
	     
		
		// ���ڸ� ���ڷ� ����ȯ
		int i = 1;
		String strInt = Integer.toString(i);
		System.out.println(strInt); // 1 
		System.out.println(strInt.getClass()); // class java.lang.String ������ 
	}

}
