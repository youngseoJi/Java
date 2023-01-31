package withArraylist;

public class GoldCustomer extends Customer{

	double saleRatio;
	
	// ��� ��� �� ������ : ����Ʈ ������ �� ���Ϸ� å��
	public GoldCustomer (int cutomerID, String cutomerName) {
		
		super(cutomerID, cutomerName);
		customerGrade = "Gold";
		bonusRatio = 0.2;
		saleRatio = 0.1;
	}

	// ������
	@Override
	public int calcPrice(int price) {
		// ��������Ʈ
		bonuspoint += price * bonusRatio;
		// ���ϵ� ���� ���
		return price - (int)(price * saleRatio);
	}
	
	
}
