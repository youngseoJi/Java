package innerclass;

// �ܺ�Ŭ����
class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	// ����Ŭ���� : �ܺ�Ŭ������ ������ �޼ҵ帣 ��� ����, ����� �� �ִ�. 
	class InClass {
		int inNum = 200;
		// static Ŭ���� �� �޼ҵ� ��� �Ұ���, �ν��Ͻ������� ������� �����־���ϴµ� ����Ŭ������ �Ұ���
//		static sInNum = 100;
		
		// InClass ����Ŭ���� �� �Լ�
		void inTest() {
			System.out.println(sNum);
			System.out.println(num);
		}
	}
	
	
}

public class InnerTest {

	public static void main(String[] args) {

		// OutClass �ܺ�Ŭ���� Ÿ���� �ν��Ͻ� ���� 
		OutClass outClass = new OutClass();
		// ����Ŭ������ �Լ� ȣ��
		outClass.inClass.inTest();
		
		// �ܺ�Ŭ������ ���ο� �ִ� ����Ŭ���� Ÿ���� �ν��Ͻ� ����
		OutClass.InClass inClass = outClass.new InClass(); 
	}

}
