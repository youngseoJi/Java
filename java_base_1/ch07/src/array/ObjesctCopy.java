package array;

// ��ü�迭 ���� ����  : ���� �ν��Ͻ� ��ü�� ����Ű�� �־ �ּҺ���, ������ �ν��Ͻ��� �޸𸮸� ��ҷ� ����
public class ObjesctCopy {

	public static void main(String[] args) {

		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
	
		bookArr1[0] = new Book("å1", "�۰�1");
		bookArr1[1] = new Book("å2", "�۰�2");
		bookArr1[2] = new Book("å3", "�۰�3");

		// arraycopy : �迭 ���� �޼ҵ�
//		System.arraycopy(src, srcPos, dest, destPos, length);
// 						������, ��𼭺���, ���ٰ�, ��𼭺���, �� ���, �����Ұ����� 
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		
		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfomation();
		}
		/* ���� �ߵ�
		 * å1, �۰�1
		 * å2, �۰�2
		 * å3, �۰�3*/
		System.out.println("====ù��° �������� bookArr1========");
		
		bookArr1[0].setBookName("å�̸�����");
		bookArr1[0].setAuthor("�ٸ��۰��̸�");
		
	
		for(int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfomation();
		}
		
		System.out.println("=====bookArr2=======");

		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfomation();
		}
		
		// bookArr 1�� 2�� ���� �����ϰ� ���, ���� �ƴ� �ּҸ� �����ϱ⶧���� ���� ��ü���Ǿ� ���� ���̺���Ǹ� ���� ����ȴ�.
		/*å�̸�����, �ٸ��۰��̸�
		 *å2, �۰�2
		 *å3, �۰�3  */
	}

}
