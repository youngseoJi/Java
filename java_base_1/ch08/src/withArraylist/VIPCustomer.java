package withArraylist;

// VIP �� - ����Ŭ���� �� Ŭ������ ��ɵ��� �������� ��ӹ޾� �����
public class VIPCustomer extends Customer {


	// VIP ���� ���� �߰� ���� ��å �� ��� ���� ��ġ
	private int agentID;// ���� ���� �ĺ���
	private double saleRatio;// ���η�
	
	// VIP �� ������
	public VIPCustomer(int cutomerID, String customerName, int agentID)
	{
	 // super() : ���Ű���� /  �Ⱥ������� �ִ�.() ��������� ����Ʈ �����ڸ� �ҷ��´�. 
	  super(cutomerID, customerName);
	  
	  // ��ӹ��� Ŭ���� ����
 	  customerGrade = "VIP";
	  bonusRatio = 0.05;
	  saleRatio = 0.1;
	  
	  // ���� Ŭ������ ����
	  this.agentID = agentID;
	  // System.out.println("VIP");
	}
	
	// VIP ���ʽ� & ���η�
	// �޼��� �������̵� : ������ �̸� , �Ű�����, ��ȯ���� ���� �޼��带 ������
		public int calcPrice(int price) {
			bonuspoint += price * bonusRatio;
			return price - (int)(price * saleRatio);
		
		}
	
	public int getAgentID() {
		return agentID;
	}
	
	// ������
	@Override
	public String showCustomerInfo() {
		// super ���� Ŭ���� �޼��带 ȣ���� �� �ִ�. 
		return super.showCustomerInfo() + "��� ���� ID : " + agentID;
	}
	
}
