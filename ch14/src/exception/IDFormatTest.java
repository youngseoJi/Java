package exception;

public class IDFormatTest {

	private String userID;
	
	// �������̵� ��ȸ
	private String getUserID() {
		return userID;
	}

	// �������̵� ����
	// throws - ���� ����ϴ� ������ ���� ��鸵�� �̷�� 
	public void setUserID(String userID) throws IDFormatException{
		
		if(userID == null) {
			// throw - �����߻� 
			throw new IDFormatException("���̵� �ۼ����ּ���.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵� 8���� �̻� 20���� ���Ϸ� �ۼ����ּ���.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		
		// ���� �ڵ鸵, throws �̷�
		IDFormatTest idTest = new IDFormatTest();
		String userID = null;
		
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
			// exception.IDFormatException: ���̵� �ۼ����ּ���. -> �̼��� ��, �����޼��� ���
		}
		

		userID = "1234567";
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
			//exception.IDFormatException: ���̵� 8���� �̻� 20���� ���Ϸ� �ۼ����ּ���.
		}
	}

}
