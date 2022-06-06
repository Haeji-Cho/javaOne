package workspace.chap14.src.sec03;

public class Interrupt2Demo {
	public static void main(String[] args) {
		Runnable task = () -> {
			while (!Thread.currentThread().isInterrupted()) {
				System.out.println("���� ��...");
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