package cha2;

public class Constant {

	public static void main(String[] args) {

		// ��� (������ �ʴ� ��)
		/*��� ���� : final Ű���� ���
		 *�缱�� �Ұ���
		 *����� ��Ȱ���� �� �ִ�. ���� �����ϸ� �ش� ����� ���� ��� ����Ǵ�*/
		
		
		// ���ͷ�(literal)
		/* ���ͷ� : ���α׷����� ����ϴ� ��� ����, ��, �� �� -> ��) 10, 3.14, ��A��, true
		 * ���ͷ��� �ش�Ǵ� ���� Ư�� �޸� ������ ��� Ǯ(constant pool)�� ���� -> �ʿ��� ��� ��� Ǯ���� �����ͼ� ���
		 * ��� Ǯ�� ���� �� �� ������ int�� �Ǽ��� double�� ����
		 * ���� long �̳� float ������ �����ؾ� �ϴ� ��� �ĺ��� (L, I, F, f)
		*/
		final int MAX_MUM = 100;
		final float PI = 3.14f;
		
		final int STUDENT_MUM = 30;
		int num = 0;
		if (num == STUDENT_MUM) {
			
		}
		System.out.println(STUDENT_MUM);
	}

}
