package inheritance;

// �� Ŭ����
public class Customer {
	// protected : private������ ��Ӱ��迡���� public ���� ��밡���ϰ���
	protected int customerID; // �ĺ���
	protected String customerName; // �̸�
	protected String customerGrade; // ���
	int bonuspoint; // ����Ʈ
	protected double bonusRatio; // ����Ʈ ���̴� ����
	/* ����Ʈ ������
	public Customer ()
	{
	  customerGrade = "SILVER";
	  bonusRatio = 0.01;
	}
	*/
	// �� ������ : �ʼ� �Ű�����
	public Customer (int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer");
	}
	
	// �� ��޿� ���� ���ʽ� & ���η�
	public int calcPrice(int price) {
		if(customerGrade == "SILVER") {
			bonuspoint += price * bonusRatio;
		}
		
		return price;
	
	}
	
	public String showCustomerInfo() {
		return customerName + "��� : " + customerGrade + ", ���ʽ� ����Ʈ :" + bonuspoint;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonuspoint() {
		return bonuspoint;
	}

	public void setBonuspoint(int bonuspoint) {
		this.bonuspoint = bonuspoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
}