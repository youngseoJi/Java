package interfaceex;
// , ����Ͽ� �������� �������̽� ���;
public class Customer implements Buy, Sell{

	// �������̽����� ������ �޼��� �����ϱ�
	@Override
	public void sell() {

		System.out.println("�Ǹ�");
	}

	@Override
	public void buy() {
			
		System.out.println("����");
	}

	
//	�������̽� Ȱ�� : �� �������̽��� ����Ʈ �޼��尡 �ߺ��Ǵ� �ܿ�, ������ Ŭ�����ּ� �ߺ��� ����Ʈ �޼��带 �������Ѵ�.
	@Override
	public void order() {
		System.out.println("�� �Ǹ� / �ֹ�");
	}

	
	
}
