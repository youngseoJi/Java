package exception;

public class AutoCloseTest {

	public static void main(String[] args) {

		try (AutoCloseObj obj = new AutoCloseObj()){
			// throw : ������ �߻��ϴ� Ű����, �̼��� �̽� �߻� -> catch�� �� 
			throw new Exception();
		}catch(Exception e) {
			System.out.println("eception");
		}
		
	}
}