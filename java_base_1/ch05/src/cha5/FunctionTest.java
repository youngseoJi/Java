package cha5;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		// ������ �Լ� ���, �Լ� ȣ���ϱ�
		int sum = addNum(num1, num2);
		System.out.println(sum); // 40
	}
	// �Լ� ���� addNum
	// ��ȯ�ϴ� ���� ������ int X -> void�� ������ȴ�. 
	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
