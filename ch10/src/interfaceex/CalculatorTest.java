package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		
		// Ÿ�� ��ĳ����
		Calc calc1 = new CompleteCalc();
		CompleteCalc calc2 = new CompleteCalc();
		Calculator calc3 = new CompleteCalc();
		
//		 System.out.println(/calc1.add(num1, num2)); // 13 
		// ����Ʈ �޼��� test
		calc1.description();
		
		// static �޼��� test
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum); //15
		
	}

}
