package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
	
		Customer customerBee = new Customer(3, "Bee");
		int price = customerBee.calcPrice(10000);
		System.out.println("���ұݾ��� " + price +"�� " + customerBee.showCustomerInfo()); // Bee��� : SILVER, ���ʽ� ����Ʈ :100
		
		VIPCustomer customerpark = new VIPCustomer(4, "park", 02);
		price = customerpark.calcPrice(100000);
		System.out.println("���ұݾ��� " + price +"�� " + customerpark.showCustomerInfo()); // park��� : VIP, ���ʽ� ����Ʈ :500

		Customer customerMe = new VIPCustomer(03, "Me", 03);
		price = customerMe.calcPrice(20000);
		System.out.println("���ұݾ���" + price + "�� " + customerMe.showCustomerInfo() );
		
		
	}

}
