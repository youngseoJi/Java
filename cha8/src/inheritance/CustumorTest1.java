package inheritance;

public class CustumorTest1 {

	public static void main(String[] args) {
		
		// �Ϲ� ��
		Customer customerJi = new Customer(1, "Ji");
		/*customerJi.setCustomerID(1);
		customerJi.setCustomerName("Ji");*/

		// VIP ��
		VIPCustomer customerKim = new VIPCustomer(2, "Kim");
		/*customerKim.setCustomerID(2);
		customerKim.setCustomerName("Kim");*/
		
		customerKim.bonuspoint = 1000;
		
		System.out.println(customerJi.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo()); 
	}

}
