package workspace.chap03.src.sec06;

public class ReturnDemo {
	public static void main(String[] args) {
		printScore(99);
		printScore(120);
	}

	public static void printScore(int score) {
		if (score < 0 || score > 100) {
			System.out.println("�߸��� ���� : " + score);
			return;
		}
		System.out.println("���� : " + score);
	}
}
