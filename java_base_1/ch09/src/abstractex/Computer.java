package abstractex;

//�߻�Ŭ���� abstract : ����� �ϱ����� �����ϴ� Ŭ���� , ȥ�� ���� ���ϸ� �ν��Ͻ�ȭ ���� ����
public abstract class Computer {
	
	// abstract �߻� �޼���  : ����,�޼����,�Ű����� �� �˼� �ְ� {} ���� �ڵ尡 ����.
	public abstract void display();
	public abstract void typing();
	
	// �߻� �޼������ ������ �ش� �߻� �޼��带 ��ӹ޴� ���� Ŭ������ �ؾ��Ѵ�.
	
//	public abstract int add(int x, int Y);
	
	// �����޽��� : �������� ����ϴ� �޼���
	public void turnOn() {
		System.out.println("���� ON");
	}
	

	public void turnOff() {
		System.out.println("���� OFF");
	}
	
}
