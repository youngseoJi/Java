package singleton;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getInstance();
		
		Company c2 = Company.getInstance();
		
		// ���� �ν��Ͻ��� ��� - �̱�������
		System.out.println(c1); // singleton.Company@606d8acf
		System.out.println(c2); // singleton.Company@606d8acf

	}

}
