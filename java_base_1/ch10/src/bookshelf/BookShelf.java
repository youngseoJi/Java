package bookshelf;

// å�� Ŭ���� <- Ŭ������ �������̽� ���
public class BookShelf extends Shelf implements Queue{

	// ����
	// å�忡 å �߰�
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	// å�忡�� å ������ (�� ���� ����, �� �տ� å����)
	@Override
	public String deQueue() {
		// 0���� ��ġ�ϴ� å ����
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

	
}
