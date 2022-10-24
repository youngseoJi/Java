package generics;

//3d ����Ʈ ����  : �ڵ�� ���� ������ �ٸ� ���

// ���׸� Ŭ���� : <T>���� �Ű����� �����̵� �޾Ƽ� ��밡��
public class TreeDPrinter<T extends Material> {

	//Object : �ֻ��� Ÿ��, ��� Ÿ���� Object�� ����ȯ �� �� �ִ�.
	//private Object material;
	
	private T material; // ���
	

	// ��� ��ȸ
	public T getMaterial() {
		return material; 
	}

	// ��� ���, ����
	public void setMaterial(T material) {
		this.material = material;
	}

	// ����
	@Override
	public String toString() {
		return  material.toString();
	}


	public void printing() {
	  material.doPrinting();
	}
}


