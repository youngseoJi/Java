package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		// �л� Ŭ����  = new �л� �ν��Ͻ� ��ü ���� (�̸� : mh, �����ִ� �� 5000��)
		Student mh = new Student("mh", 5000);
		Student ys = new Student("ys", 10000);
		
		// ���� Ŭ���� = new ���� �ν��Ͻ� ��ü ���� (100�� ��ȣ������ ����)
		Bus bus100 = new Bus(100);
		
		mh.takeBus(bus100);
		ys.takeBus(bus100);
		mh.showInfo();
		ys.showInfo();
		bus100.showInfo();
		
		// ����ö Ŭ���� = new ����ö �ν��Ͻ�/��ü ���� (2ȣ��)
		Subway subwayGreen = new Subway(2);
		ys.takeSubway(subwayGreen);
		ys.showInfo();
		subwayGreen.showInfo();
	}

}
