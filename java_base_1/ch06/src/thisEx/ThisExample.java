package thisEx;

// �ڽ��� �޸�(�ν��Ͻ�)�� ����Ű�� this

// Birthday Ŭ����
class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		// this.year -> Birthday Ŭ������ year
		this.year = year;
	}
	
	public void printThis() {
		// this -> �����Ǵ� ������ �ν��Ͻ��� �ּ� 
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
	
		System.out.println(b1); //thisEx.Birthday@27a8c74e
		b1.printThis(); // thisEx.Birthday@27a8c74e
		
		System.out.println(b2); //thisEx.Birthday@2d8f65a4
		b2.printThis(); //thisEx.Birthday@2d8f65a4
	}

}
