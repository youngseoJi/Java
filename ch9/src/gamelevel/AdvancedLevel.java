package gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("���� �޸�");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� ��");
	}

	@Override
	public void turn() {
		System.out.println("ȸ�� ����");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("== �߱��� ==");
	}


	
}
