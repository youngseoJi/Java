package calculator;

// implements : Ÿ�Ի�� , �������̽� ��� 
// �߻� Ŭ���� : ���� ? ��ӹ��� �޼��� �� �Ϻ� �޼��常 �����ؼ�
// �������̽��� �����ڵ尡 ��� �������� ��ӹ��� �� �ִ�.
public abstract class Calculator implements Calc{

	
	// ���ϱ�
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
    // ����
	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}


}
