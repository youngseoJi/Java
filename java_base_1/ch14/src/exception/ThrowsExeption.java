package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExeption {

	// throws : �̼���/���� �̷��, ��鸵 �̷�
	public Class loadClass(String fileName,String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsExeption ex = new ThrowsExeption();
	
		// throws �� �̷� ������鸵 �ϴ°� - ����ϴ� ������ ��鸵
		try {
			ex.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} 
		
		// ���ܰ� �پ��� ���, Exception �ֻ��� Ŭ������ �׿� ����ó�� -> ������ ��Ͽ� ��ġ�ؾ���
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end"); 
	}

}
