package workspace.chap14.src.sec02;

public class Thread3Demo {
	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.print("�߰�. ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		};
		new Thread(task).start();

		for (int i = 0; i < 5; i++) {
			System.out.print("�ȳ�. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}