package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

		// �߻�Ŭ������ �Κ��Ͻ�ȭ X : ����Ǿ��� �޼��尡 ���� ����
		// Computer c1 = new computer();
		 Computer c2 = new DeskTop();		
		// Computer c3 = new NoteBook();		
		 Computer c4 = new MyNoteBook();		
		 NoteBook c5 = new MyNoteBook();		
		 
		 c2.display();
		 c4.display();
		 c5.display();
		 c5.aaa();
	}

}
