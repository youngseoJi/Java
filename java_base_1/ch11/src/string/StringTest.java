package string;

public class StringTest {

public static void main(String[] args) {

	// new �����ڷ� ������,�ν��Ͻ��� �ٸ� �޸𸮸� ����Ų��.
	String str1 = new String("abc");
	String str2 = new String("abc");
	
	System.out.println(str1 == str2); //false -> �ΰ� �ν��Ͻ��� �ּҰ� �ٸ�
	
	// ����� ���� ����Ű��, ������ �޸𸮸� ����Ų��.
	String str3 = "abc";
	String str4 = "def";
	System.out.println(str3 == str4); //true -> ���� �޸𸮸� ����Ų��.

	String str5 = new String("abc");
	String str6 = new String("def");
	
	str5 = str5.concat(str6);
	
	// new �� ������, String Ŭ���� ���ڿ��� �����Ҷ����� �Ź� ���ο� �޸𸮸� �����Ѵ�. ������, �����ϴ� �޸𸮰� �ʹ� ��������.
    // -> �ذ��� StringBuilder, StringBuffer ����ϱ� 
	System.out.println(str5); //abcdef
	
}
	
}
