package interfaceex;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		
		System.out.println("��ȭ ��� ��й�� ����- A,B,C");
		// ASCII �ڵ� �� ȣ�� -> ���� ���ڸ� �״�� ǥ���ϰ� �ʹٸ� �ڷ��� char�� ����ȯ
		int ch = System.in.read(); // IOException
		Scheduler scheduler = null;// �ʱ�ȭ
		
		// ��й���� �����̳Ŀ� ����(���� Ÿ���� �����̳Ŀ� ����), �ٸ� �ν��Ͻ� ���� - �ٸ� ���� ��ü ����
		if(ch == 'A' || ch == 'a') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'B' || ch == 'b') {
			scheduler = new LeastJob();
		}
		else if(ch == 'C' || ch == 'c') {
			scheduler = new PriorityAllocation();
		}
		// ���� ���� ���� ���, Ÿ���� �����Ǹ� ���
		else {
			System.out.println("�������� �ʴ� ���");
			return;
		}
		
		// ������ - ���� �޼��带 �ҷ����� �� �ν��Ͻ��� ���� �����Ǵ� �ڵ尡 �޶���!!
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
