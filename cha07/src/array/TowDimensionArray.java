package array;

// �������迭
public class TowDimensionArray {

	public static void main(String[] args) {
		// int �ڷ����� 2�� 3�� �������迭 ���� 
		int[][] arr = new int[2][3];
		// ����� �ʱ�ȭ ���ÿ�
		int[][] arr2 = {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length); //2
		System.out.println(arr[0].length); //3
		System.out.println(arr[1].length); //3
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++){
				System.out.println(arr2[i][j]);
				// 1 ~ 6 ���߹迭 �� ��� ��µ�
			}
		}
		 
	}

}
