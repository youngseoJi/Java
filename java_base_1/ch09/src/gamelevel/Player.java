package gamelevel;

// ����
public class Player {
	
	// PlayerLevel Ŭ���� ���
	private PlayerLevel level;
	
	// ����Ʈ ������
	// ���� ó�� ���� ����
	public Player() {
		level = new BeginLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	// ���� ���� ����
	public void upgradelevel(PlayerLevel level) {
		// Player.level
		this.level = level;
		level.showLevelMessage();
	}
	
	// ���� ���� 
	public void play(int count) {
		// PlayerLevel Ŭ������ ���ø� Ŭ���� ȣ�� -> ���� 
		level.go(count);
	}
	
}
