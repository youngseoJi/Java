package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
    // protected : ��ӹ��� ������ �� �� ����, �迭 ���� 
	protected ArrayList<String> shelf;
	
	// ����Ʈ ������
	public Shelf() {
		// shelf �迭  �ν��Ͻ� ����
		shelf = new ArrayList<String>();
	}
	
	// get �޼��� ����
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}

}
