package template;

// ����� �����ϴ� ��
// �Ϲ�Ŭ���� <- Car �߻�Ŭ���� ���
public class ManualCar extends Car{

	// �߻�޼��� ��� -> �����޼���
	@Override
	public void drive() {
	System.out.println("����� ����");
	System.out.println("����� �ڵ� ����");
	}

	@Override
	public void stop() {
		System.out.println("����� �극��ũ");
	}
	
}
