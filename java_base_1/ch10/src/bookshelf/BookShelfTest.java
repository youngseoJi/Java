package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		// ť Ÿ�� å�� �ļ�
		Queue shelfQueue = new BookShelf();
		// ������� å �ֱ�
		shelfQueue.enQueue("�̼���1");
		shelfQueue.enQueue("�̼���2");
		shelfQueue.enQueue("�̼���3");
		
		// �Ǿ��� å���� ������
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
