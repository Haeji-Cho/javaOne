package workspace.chap14.src.sec03;

public class DaemonDemo {
	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 3; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName());
			}
		};

		Thread t1 = new Thread(task, "�۾� ������");
		// t1.setDaemon(true);
		t1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("���� �����尡 �������ϴ�.");
	}
}