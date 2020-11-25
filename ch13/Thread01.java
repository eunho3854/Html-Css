package ch13;

class Another implements Runnable { // Runnable Ÿ���� �Ǿ�� ��.
	
	// ������� �ڵ���� = ����(������)
	@Override
	public void run() {
		System.out.println("���ο� ������ �����.");
		for(int i=0; i<11; i++) {
			try {
				System.out.println("run : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("���ο� ������ ����");
	}
}

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("main ������ �����.");
		
		// ���ο� ������ ����
		// 1. ������ ��ü ���� 2. Ÿ�� ���� 3. ����
		
		Thread t1 = new Thread(new Another());
		t1.start(); // �������� �����尡 ����
		
		for(int i=0; i<11; i++) {
			try {
				System.out.println("main : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main ������ ����");
	} // end of main

}