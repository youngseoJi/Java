package object;

// �л� Ŭ����
class Student {
	int stID; // �ĺ���
	String stName; // �̸�
	
	Student(int stID, String stName) { // �ʼ� �Ű�����
		this.stID = stID;
		this.stName = stName;
	}

	// equals �޼��� �������ϱ� -> �ν��Ͻ� �ּҺ񱳰� �ƴ�, ���� ������ ���ϴ� �޼���� ������
	@Override
	public boolean equals(Object obj) {
		// Student�� ��ü, �ν��Ͻ��� ���
		if( obj instanceof Student) {
			// obj�� Student Ÿ������ �����Ͽ� st ����
			Student st = (Student)obj;
			
			// �л� �ĺ��ڿ� st�� �ĺ��ڰ� ���ٸ� true -> �� ���� ����̶��, �ν��Ͻ� �ּ� �񱳰� �ƴ� ����
			if(stID == st.stID) {
				return true;
			} // ���� �ٸ��ٸ� false
			else { 
				return false;
			}
		}// ��ü�� �ƴ϶��  false
		return false;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("T");
		String str2 = new String("T");
		System.out.println(str1 == str2); // �ν��Ͻ�(�ּ�)�� �������� -> false
		System.out.println(str1.equals(str2)); // ���ڰ� ������ -> true
		

		Student st1 = new Student(01, "����");
		Student st2 = new Student(01, "����");
		
		// equals �޼��� �������� ���
		System.out.println(st1 == st2);  // �ν��Ͻ�(�ּ�)�� �������� -> false
		System.out.println(st1.equals(st2));   // ���� ������ -> true
		/*
		System.out.println(st1 == st2);  // �ν��Ͻ�(�ּ�)�� �������� -> false
		System.out.println(st1.equals(st2));  // �ν��Ͻ�(�ּ�)�� �������� -> false
		// ���� equals Ŭ������ == �� ������ ��� */

	}

}
