package interfaceex;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�� ��� ���� ������ ��ȭ�� ���� ������");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("����� ���� ���� ������ ������ �켱�� �����");
	}

		
}
