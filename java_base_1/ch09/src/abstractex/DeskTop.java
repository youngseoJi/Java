package abstractex;

// �߻�Ŭ������ �߻�޼��带 ��� ��ӹ��� �޴� ���, �Ϲ�Ŭ���� ��� ����
public class DeskTop extends Computer{
	
	// �߻�Ŭ������ �߻� �޼��带 ��ӹ������ -> ���� Ŭ������ å������  �߻� �޼��� �����ؾ���

	@Override
	public void display() {
		System.out.println("DeskTop diplay()");		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");				
	}
	
	

}
