package generics;

// �ö�ƽ ���
public class Plastic extends Material{
	
	// toString() �޼��� ������
	public String toString() {
		return "3D ������ ��� Plastic";
	}

	@Override
	public void doPrinting() {

		System.out.println("Prastic ���� ������");
	}
	
	
}
