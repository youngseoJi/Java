package inheritance;

// ���  : �Ϲ����� �Ͱ� ��ü���� Ŭ������ ���� is - a ����
public class Circle {

	// ���� : point Ŭ������ ���� Ȱ���ϰ� ������ �������� �������
	Point point; // has -a ����
	
	private int x;
	private int y;

	private int radius;

	public Circle() {
		point = new Point();
	}
}
