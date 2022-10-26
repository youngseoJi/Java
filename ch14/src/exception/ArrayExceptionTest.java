package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		// try : ���� �� �ڵ�  �������� �� ������ ����, �����߻��� catch {}�� �ѱ�
		try {
			for(int i=0; i <=5; i++) {
				System.out.println(arr[i]);
			}
		}
		// catch : �����߻��� ���� �� �ڵ�
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); // �μ����� �̸���, ������ �� �κ��� �˷��� e.toString()
		
		//finally ���� ������ return ���� 
		//return;
		}
		// finally : try�� ����Ǹ� �Բ� �����(������ �ֵ縻��, �μ����� �߻��ϵ� ���� ������ ����), �ո����� ���� �ҋ� ����Թ�
		finally {
			System.out.println("finally");
			
		}
		System.out.println("end");
	} 


}
