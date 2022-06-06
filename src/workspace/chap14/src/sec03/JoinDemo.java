package workspace.chap14.src.sec03;

class JoinThread extends Thread {
	int total;

	public void run() {
		for (int i = 1; i <= 100; i++)
			total += i;
	}
}

public class JoinDemo {
	public static void main(String[] args) {
		JoinThread t = new JoinThread();
		t.start();

		// try {
		//	t.join();
		//	System.out.println("������ t�� ���� ������ ���...");
		// } catch (InterruptedException e) {
		// }
		System.out.println("���� : " + t.total);
	}
}