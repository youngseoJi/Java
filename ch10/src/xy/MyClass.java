package xy;

// MyClass �Ϲ� Ŭ���� <- �������̽� myInterface ��� <- X,Y �������̽� ���
public class MyClass implements myInterface{

	@Override
	public void y() {
		System.out.println("x()");
	}

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
		
		// MyClass �������̽� Ÿ������ �����Ǿ�� ! 
		// -> XŸ�Կ� �����̵Ǿ��⿡ XŸ���� �޼��常 ��밡���ϴ�.
		X  xClass = myClass;
		xClass.x();
	}
}
