package interfaceex;

// interface ���� ������ �޼���� ���� : ��� �߻�ȭ �޼��� & ���

public interface Calc {
	// puvlic statuc final �����Ȱ�

	double PI = 3.14;
	int ERROR = -99999999;

	// public abstact ������ ��
	
	// ���� : �� �޼���� � ���̴� ����
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// ����Ʈ �޼���
	default void description() {
		System.out.println("���� ���� ����");
	}
	
	// static �޼��� : �ν��Ͻ��� ������ ������� ��밡��, ���� �� ��밡��
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		return total;
	}
	

}
