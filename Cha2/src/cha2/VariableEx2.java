package cha2;

public class VariableEx2 {

	public static void main(String[] args) {

		
		/* �ڷ����� �ʿ��� ����
		 * ������ ���� �ҋ� ������ ����� �޸� ũ��� Ÿ���� �����ϱ� ���ؼ� �ʿ�
		 * ���� ���� �ڷ��� �߷� (local variable type inference):
		 ������ ���ԵǴ� ���� ���� �����Ϸ��� �߷� 
		 * ������ ���� ��ũ��Ʈ ���� �ٸ��� �ѹ� �����ϸ� Ÿ���� ����� �� ����.
		 */
		
		
		// ���� = ���ͷ�
		
		// ���� �ڷ���
		
		// int 4byte  -> ������ ��� int������ ����ȴ�., 4byte�� ����ȴ�.
		// ������ ������ ����.
		int num = 10;
		
	    // int num1 = 12345678910; 
		// ���� 4byte �� �����Ҽ��ִ� ������ �Ѿ�� ���� ->
		
		// Long 8byte =  �ڿ� L �ĺ����ʼ� (Long������ �����Ѵٴ� ��,)
		Long num1 = 12345678910L;
		
		// ���ڴ� ���������� ���������� ǥ��ȴ�.  ���ڴ� ������ ���� �ִ�. �ƽ�Ű�ڵ�
		char ch = 'A';
		
		System.out.println(ch); // A
		System.out.println((int)ch); // 65
		
		ch = 66; 
		System.out.println(ch); // B
	
	
		int ch2 = 67;
		
		System.out.println(ch2); // 67
		System.out.println((char)ch2); // C
		
		
		// �Ǽ� �ڷ���
		
		
		// double 8byte -> �Ǽ��� ������ double�� ����ȴ�. - �⺻������ double�� ����ϴ� ��
		
		double dNum = 3.14;
		
		// float 4byte  = �� �� �ĺ��� f �ʼ�! float ������ �����Ѵٴ� ���� ���������Ѵ�.
		float fNum = 3.14f;
		
		// boolean ���� : ���� true(��), false(����)
		
		
	}

}
