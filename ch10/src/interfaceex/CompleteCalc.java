package interfaceex;

// �Ϲ�Ŭ���� : ����? �߻�Ŭ������ �߻�޼��带 ��� ����ؼ�
// extends : �������
public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// ������ ���� 0�� �ƴϸ� ������
		if(num2 != 0) {
			return num1 / num2;
		}
		// 0�ϰ�� ���� ���
		return ERROR;
	}

	public void showInfo() {
		System.out.println("Calc �������̽� ����");
	}
	
}
