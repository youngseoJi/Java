package array;

// ��ü �迭 �����
public class BookArray {

	public static void main(String[] args) {
		
		// Book�� �ڷ��� (�ش� Ŭ����)  
		// å�� ����ų �ּ��� �ڸ��� 5�� ���������.
		Book[] library = new Book[5]; 
		for(int i = 0 ; i < library.length; i++ ) {
			System.out.println(library[i]);// null 5�� ���
			// ��ü �ʱ�ȭ ���� null
		}
		// �ν��Ͻ� �����Ͽ� �� �迭�� �ڸ��� ����
		library[0] = new Book("����å1","ys");
		library[1] = new Book("����å2","ys");
		library[2] = new Book("����å3","ys");
		library[3] = new Book("����å4","ys");
		library[4] = new Book("����å5","ys");
		
		// �� �ν��Ͻ�/��ü�� �ּҰ�  -> array.Book@33833882
		for(int i =0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		// �迭 �ڸ��� �� ���� ��� -> ����å1, ys 
		for(int i =0; i < library.length; i++) {
			library[i].showBookInfomation();
		}
	}

}
