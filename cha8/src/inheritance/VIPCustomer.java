package inheritance;

// VIP �� - ����Ŭ���� �� Ŭ������ ��ɵ��� �������� ��ӹ޾� �����
public class VIPCustomer extends Customer {


	// VIP ���� ���� �߰� ���� ��å �� ��� ���� ��ġ
	private int agentID;// ���� ���� �ĺ���
	private double saleRatio;// ���η�
	
	// VIP �� ������
	public VIPCustomer(int cutomerID, String customerName)
	{
	 // super() : ���Ű���� /  �Ⱥ������� �ִ�.() ��������� ����Ʈ �����ڸ� �ҷ��´�. 
	  super(cutomerID, customerName);
 	  customerGrade = "VIP";
	  bonusRatio = 0.05;
	  saleRatio = 0.1;
	  
	  System.out.println("VIP");
	}
	
	public int getAgentID() {
		return agentID;
	}
}
