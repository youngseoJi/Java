package object;

class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		
		// Book Ŭ���� Ÿ�� �ν��Ͻ�
		// String �޼��� ������ �� ���
		Book book = new Book("å1", "�����۰�");
		System.out.println(book); // å1,�����۰�
		/* String �޼ҵ� ������ �ϱ� �� ��°�
		Book book = new Book("å1", "�����۰�");
		System.out.println(book); // object.Book@606d8acf*/
		
		// String Ŭ���� Ÿ�� �ν��Ͻ� 
		// ���ڰ� �״�� ��ĵǴ� ����? �̹� toString �ǰ� �⺻ �����Ǿ� �ֱ⋚��
		String str = new String("test");
		System.out.println(str); // test
	}

}
