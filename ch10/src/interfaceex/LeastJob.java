package interfaceex;

// Scheduler �������̽� ��� -> �����س��� ��� �����Ұ�
public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		 System.out.println("��� ��ȭ�� �ɷ��� ������� ��⿭���� �����");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� �������� �����ȭ�� �Ҵ���");
	}

	

}
