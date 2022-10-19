package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class StringTEst {

	public static void main(String[] args) throws ClassNotFoundException {

		// Class �����ε�
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		// Constructor �� ��� ��ȸ ->cons �� ��� ����ͼ� c�� �ֱ�
		for(Constructor c: cons) {
			System.out.println(c);
		}
		
		Field[] fields = strClass.getFields();
		// fields �� ��� ��ȸ
		for( Field f : fields) {
			System.out.println(f);
		}
		
	}

}
