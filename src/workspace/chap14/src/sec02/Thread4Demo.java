package workspace.chap14.src.sec02;

public class Thread4Demo {
	public static void main(String[] args) {
		Thread t = new WorkerThread();
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.print("�ȳ�. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}

class WorkerThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print("�߰�. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}