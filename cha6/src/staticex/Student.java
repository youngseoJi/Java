package staticex;

public class Student {
	
	// ������ ���� 
	// private : �ν��Ͻ�, ��ü �ۿ����� ���� ���ϰ� 
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	// �л��� �����ɶ����� ����Ʈ���� ����
	public Student() {
		// ����,����ɶ����� 1�� ����
		serialNum++;
		// serialNum�� �����ؼ� 
		// -> ������ �ν��Ͻ�(�� �л� id)�� ����ش�.
		studentID = serialNum;
	}
	
    /* ������ �Ǵ� ���� static ������ �����Ͽ� ���� 
     * ���� �ν��Ͻ��� �ϳ��� �޸𸮰��� ������ �� �ʿ� 
     * static �޼��� : �ν��Ͻ� ������ ����� �� ����.  
     * ���� : �ν��Ͻ� ������ �� �ν��Ͻ��� ���� �����Ǿ�� �ϹǷ�, static - �ν��Ͻ� ������ ��Ȱ���ϱ⿡ ��� X*/
	 

	
	public static int getSerialNum() {
		
		// �������� : �޼��尡 ����ɶ� ���� -> ����Ǹ� ����
		int i = 10; 
		i++;
		System.out.println(i);
		
		// �������, �ν��Ͻ� ����  - static �޼��忡���� , �ν��Ͻ� ������ ����� �� ����.
		// studentName = "ȫ�浿";
		
		// static ����, Ŭ���� ����
		return serialNum;
	}
	
}
