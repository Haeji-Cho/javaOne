package workspace.chap14.src.sec04;

class TotalThread extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++)
				total += i;
			notify();
		}
	}
}

public class WaitNotifyDemo {
	public static void main(String[] args) {
		TotalThread t = new TotalThread();
		t.start();
		synchronized (t) {
			try {
				System.out.println("������ t�� ���� ������ ���...");
				t.wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("���� : " + t.total);
	}
}