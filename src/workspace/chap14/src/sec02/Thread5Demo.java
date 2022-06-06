package workspace.chap14.src.sec02;

public class Thread5Demo {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.print("�߰�. ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		}.start();

		for (int i = 0; i < 5; i++) {
			System.out.print("�ȳ�. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}