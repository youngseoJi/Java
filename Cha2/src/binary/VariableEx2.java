package binary;

public class VariableEx2 {

	public static void main(String[] args) {

		// ���� = ���ͷ�
		
		// int 4byte  -> ������ ��� int��, 4byte�� ����ȴ�.
		// ������ ������ ����.
		int num = 10;
		
	    // int num1 = 12345678910; 
		// ���� 4byte �� �����Ҽ��ִ� ������ �Ѿ�� ���� ->
		
		// Long 8byte =  �ڿ� L �ĺ����ʼ� (Long������ �����Ѵٴ� ��,)
		Long num1 = 12345678910L;
		
		// ����
		// ���ڴ� ���������� ���������� ǥ��ȴ�.  ���ڴ� ������ ���� �ִ�. �ƽ�Ű�ڵ�
		char ch = 'A';
		
		System.out.println(ch); // A
		System.out.println((int)ch); // 65
		
		ch = 66; 
		System.out.println(ch); // B
	
	
		int ch2 = 67;
		
		System.out.println(ch2); // A
		System.out.println((char)ch2); // 65
	}

}
