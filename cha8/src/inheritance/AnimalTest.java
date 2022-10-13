package inheritance;

// ���� Ŭ���� 
class Animal {
	public void move() {
		System.out.println("������ �����δ�.");
	}
}

// ���� Ŭ���� 3�� 
class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �ȴ´�.");
	}
}

class Cat extends Animal{
	public void move() {
		System.out.println("����̰� �׹߷� ���� �ڴ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ����.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Cat());
		test.moveAnimal(new Eagle());		
	}
	
	// �޼ҵ� : �Ű�����  animal
	public void moveAnimal(Animal animal) {
		animal.move(); // <- �ڵ� ���ٿ� ���� ����� �پ��ϴ� . ���⼺
	}

}
