package classex;

public class classTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// Person Ŭ���� Ÿ�� �ν��Ͻ� ����
		Person person = new Person();
		
		// Class �� ���� �� �� �ִ� ��� 3����
		
		// 1. �����ε� - object Ŭ���� �̿� 
		
		// getClass()�� object �޼ҵ� -> Ŭ������ ��ȯ���ִ� �޼ҵ�� �ҷ��� �� ����
		// �̹� �ν��Ͻ��� ���� �������, Person  Ŭ������ ������ �Ǿ���� ����� �� �ִ�.
		Class pClass = person.getClass();
		System.out.println(pClass.getName()); //classex.Person Ǯ���� : ��Ű����.�ش�Ŭ������

	    // 2.�����ε� - ������ : ������ �� person Ŭ������ ������
		
		// �̹� Person  Ŭ������ ������ �Ǿ���� ����� �� �ִ�.
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName()); // classex.Person
		
		// 3. �����ε� - .forName("") : Ŭ���� �̸����� �������
		// forName�� ������ �Ǵ� �߿� ���ڿ��� ����Ͽ� �� �̸��� Ŭ������ ������ �о���°�
		
		Class pClass3 = Class.forName("classex.Person"); // classex.Person
		Class pClass4 = Class.forName("java.lang.String"); //java.lang.String
		
		System.out.println(pClass3.getName());
		System.out.println(pClass4.getName());
	}
}
