package withArraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		// �迭 Ÿ�� : �ֻ��� Ŭ���� Customer -> gold, vip ��� �ش�
		// �ϳ��� Ÿ������ ! 
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		// �ν��Ͻ� 5�� ����
		Customer customer1 = new Customer(01, "����");
		Customer customer2 = new Customer(02, "�浿");
		GoldCustomer customer3 = new GoldCustomer(03, "����");
		GoldCustomer customer4 = new GoldCustomer(04, "����");
		VIPCustomer customer5 = new VIPCustomer(05, "����", 105);
	
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		System.out.println("======�� ���� ��� ======");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
	/* 		������� : SILVER, ���ʽ� ����Ʈ :0
			�浿��� : SILVER, ���ʽ� ����Ʈ :0
			������ : Gold, ���ʽ� ����Ʈ :0
			������� : Gold, ���ʽ� ����Ʈ :0
			���ϵ�� : VIP, ���ʽ� ����Ʈ :0 */
		}
		System.out.println("======���η��� ���ʽ� ����Ʈ��� ======");
		
		int price = 10000;
		for(Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� ����, ");
			System.out.println(customer.showCustomerInfo());
			// ������ Ȱ���ϱ�
			/* �������� 10000�� ����, 
			������� : SILVER, ���ʽ� ����Ʈ :100
			�浿���� 10000�� ����, 
			�浿��� : SILVER, ���ʽ� ����Ʈ :100
			������� 9000�� ����, 
			������ : Gold, ���ʽ� ����Ʈ :2000
			�������� 9000�� ����, 
			������� : Gold, ���ʽ� ����Ʈ :2000
			���ϴ��� 9000�� ����, 
			���ϵ�� : VIP, ���ʽ� ����Ʈ :500��� ���� ID : 105 */
		}
	}

}
