package array;
// ��ü�迭�� �����ص� �ν��Ͻ��� ��� �����Ǵ� �� X
// ��ü�迭�� �����Ҷ� ���� �ν��Ͻ��� ����Ű�ų� �ٸ� �ν��Ͻ��� ����ų �� ������ ���


//��ü�迭 ���� ���� : ���� �ٸ� �ν��Ͻ��� �޸𸮸� ��ҷ� ����
public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
	
		bookArr1[0] = new Book("å1", "�۰�1");
		bookArr1[1] = new Book("å2", "�۰�2");
		bookArr1[2] = new Book("å3", "�۰�3");
		// ����Ʈ �����ڷ� �ν��Ͻ� ����
		bookArr2[0] = new Book();
		bookArr2[1] = new Book();
		bookArr2[2] = new Book();

		for(int i = 0; i < bookArr1.length; i++) {
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
			bookArr2[i].setBookName(bookArr1[i].getBookName());
		}
	
		System.out.println("====ù��° �������� bookArr1========");
		
		bookArr1[0].setBookName("å�̸�����");
		bookArr1[0].setAuthor("�ٸ��۰��̸�");
		
	
		for(int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfomation();
		}
		/*å�̸�����, �ٸ��۰��̸�
		 *å2, �۰�2
		 *å3, �۰�3  */
		
		System.out.println("=====bookArr2=======");

		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfomation();
		}
		 
		/*å1, �۰�1
		 *å2, �۰�2
		 *å3, �۰�3  */
		// bookArr 1�� 2�� ��ü�迭�� ���� �ٸ��� ���!
		
		System.out.println("=====ó������ ������ �迭��� ��¹��=======");

		String[] strArr = {"Java", "C", "C++"};
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		int[] intArr = {1,2,3,4,5};
		
		for(int i : intArr) {
			System.out.println(i);
		}
	}


}
