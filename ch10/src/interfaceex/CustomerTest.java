package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		// Customer Ÿ��
		Customer customer = new Customer();
		// Buy Ÿ������ �����̵�, Ÿ������ ���� (Customer�� ���� )
		Buy buyer = customer;
		
		buyer.buy();
		// Sell Ÿ������ �����̵�, Ÿ������ ���� (Customer�� ���� )
		Sell seller = customer;
		seller.sell();
		
		// �ν��Ͻ� Customer customer�� �޼��尡 ȣ��� ! �������̵��� �޼���
		// * �ٸ� Ÿ�Կ� ���ԵǾ��! *
		customer.order();
		buyer.order();
		seller.order();
	}
}
