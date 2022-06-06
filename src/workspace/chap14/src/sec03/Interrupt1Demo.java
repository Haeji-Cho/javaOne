package workspace.chap14.src.sec03;

public class Interrupt1Demo {
	public static void main(String[] args) {
		Runnable task = () -> {
			try {
				while (true) {
					System.out.println("���� ��...");
					Thread.sleep(1);
				}
			} catch (InterruptedException e) {
				// ���ͷ�Ʈ ó�� �ڵ�
			}
			System.out.println("���� ����");
		};

		Thread t = new Thread(task);
		t.start();

		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
		}
		t.interrupt();
	}
}