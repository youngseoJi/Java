package generics;

public class Powder extends Material{

	// toString() �޼��� ������
	public String toString() {
		return "3D ������ ��� Powder";
	}
	
	@Override
	public void doPrinting() {

		System.out.println("Powder ���� ������");
	}
}
