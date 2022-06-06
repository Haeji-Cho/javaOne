package workspace.chap14.src.sec02;

public class Thread1Demo {
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
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

class MyRunnable implements Runnable {
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