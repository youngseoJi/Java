package bookshelf;

// �ڷᱸ��
// ť : ���Լ���, ���� ���� ���� ���� ������.
public interface Queue {
	
	// ����, ����
	void enQueue(String title); // å ���� �߰�, å�忡 å �ȱ� 
	String deQueue(); // å�� ���� ��ȯ, å�忡�� å ������ (�� ���� ����, �� �տ� å����)
	int getSize(); // å���� å�� ��  ����
}
