package template;

// �߻�Ŭ����
public abstract class Car {

	// �߻�޼��� ����
	public abstract void drive(); // ����
	public abstract void stop(); // ����
	
	
	// ���� �޼��� : ���� �޼��� 

	// Hook �޼��� : �����ڵ� �ۼ����Ұ��! ����Ŭ�������� �ʿ信 ���� �����Ǹ� �ϸ� ������ �߰��Ǵ� ��
	public void washCar() {} // ������ �ҋ��� ���ҋ��� �ִ�
	
	public void turnOn() {
		System.out.println("�õ� �ɱ�");
	}
	
	public void turnOff() {
		System.out.println("�õ� ����");
	}
	
	// ������ ������� �޼���
	
	/* final Ű���� : ���� Ŭ�������� ������ X
	 * ���ø� �޼��� : ���α׷��� �Ϸ��� ������ �ó������� ����� ���� (������ ���س���) �޼���, ����Ǹ� �ȵȴ�.
	 * �����ӿ�ũ���� ���� ���ȴ�. */
	public final void run() {
		turnOn();
		drive();
		stop();
		turnOff(); 
		washCar();// Hook �޼��� 
	}
}
