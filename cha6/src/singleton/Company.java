package singleton;

public class Company {
	
	
	// static : �Ѱ��� ���� ���̿��� static���� ����, ����
	// private : �ܺο��� private���� ����� �ν��Ͻ��� ����� �� ����, ���ο����� ����� �� �ִ�.
	private static Company instance = new Company();

	private Company() {}

	// ������ �ν��Ͻ� ��ü�� �ܺο��� ����ϱ� ���� �޼���
	// static���� �����ؼ� �ν��Ͻ� ��ü�� �������� �ʰ� �޼��带 �θ��� �� �ִ�.
	static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}