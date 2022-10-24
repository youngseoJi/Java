package generics;
// ��� �����ڷ����� ����ϰ� �ʹٸ�, Object�� ����ϸ� �ȴ�. 
// ��ĳ���� �Ǳ⋚���� �� �ڷ����� ���� � ����� �ޱ����ؼ� �ٿ�ĳ������ �ؾ��Ѵ�. -> 
public class TreeDPrinterTest {

	public static void main(String[] args) {

		// Powder Ÿ�� �Ű����� (���) �޾Ƽ� TreeDPrinter ��ü ���� 
		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
	
		Powder powder = printer.getMaterial();
		System.out.println(printer);
		
		// Plastic Ÿ�� �Ű�����(���) �޾Ƽ� TreeDPrinter ��ü ���� 
		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
	
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(printerPlastic);
		
		printerPlastic.printing();
		
	}

}
