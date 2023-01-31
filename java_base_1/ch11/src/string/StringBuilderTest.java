package string;

public class StringBuilderTest {

	public static void main(String[] args) {

		String str1 = new String("mh");
		
		System.out.println(System.identityHashCode(str1)); // 1763847188
		
		//StringBuilder�� ����
		StringBuilder buffer = new StringBuilder(str1);
	
		System.out.println(System.identityHashCode(buffer)); // 1617791695
		
		// ����
		buffer.append(" and ");
		buffer.append("ys");
		// �����ص� ���ο� �޸� ���� X ������ �޸� ����
		System.out.println(System.identityHashCode(buffer)); // 1617791695
		
		// toString()���� ���ڿ��� ��ȯ�Ͽ� �����. 
		String str2 = buffer.toString();
		System.out.println(str2); // mh and ys
	}

}
