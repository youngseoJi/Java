package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		// finally ������ ��� close()�� �ڵ�����ȴ�.
		
		// ������ �о���̴� Ŭ����
		try (FileInputStream fis = new FileInputStream("a.txt")){
			// ���� - ���Ͽ���
		} catch (IOException e) {
			System.out.println("e");
		}
		System.out.println("end");
	}
		/*
		try {
			// ���� - ���Ͽ���
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			// ������ ���� �ݾ��ֱ�
			try {
				// ������ ������ �ݾ��ְ�
				fis.close();
				// ������ ���°�� �μ���
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");
	}
	*/

}
