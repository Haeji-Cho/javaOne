package workspace.chap14.src.sec03;

class StopThread extends Thread {
	public boolean stop;

	public void run() {
		while (!stop) {
			System.out.println("���� ��...");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("���� ����");
	}
}

public class StopDemo {
	public static void main(String[] args) {
		StopThread t = new StopThread();
		t.start();

		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
		}

		t.stop = true;
	}
}