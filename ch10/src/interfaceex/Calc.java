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

}
