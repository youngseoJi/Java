package thisEx;

// �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� this

class Person{
	String name;
	int age;
	
	// ����Ʈ ������, �Ű����� X, �����ڰ� �ϳ��� ������� �ڵ�����(�������)
	public Person() {
		// �Ű������� ������ Ÿ���� �´� ������ ȣ��
		this("�̸�����",1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// ������ Ÿ���� �ش� Ŭ������ + �Լ���
	public Person returnSelf() {
		return this; // ���� �ν��Ͻ���  �ּҰ� ���
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// ����Ʈ ������ ȣ��� �ʱ�ȭ�ǰ� ��.
		Person p1 = new Person();
		System.out.println(p1.name); // �̸����� 
		System.out.println(p1.age); // 1
		
		System.out.println(p1.returnSelf()); 
	
	}

}
