package template;

// �Ϲ�Ŭ���� <- �߻�Ŭ���� ���
public class AiCar extends Car{
	
	// �߻� �޼����� -> ���� �޼��� ����
	@Override
	public void drive() {
		System.out.println("���� ����");
		System.out.println("�ڵ����� ������ ��������");
	}

	@Override
	public void stop() {
		System.out.println("�ڵ����� ������ �극��ũ");
		
	}

	
}
