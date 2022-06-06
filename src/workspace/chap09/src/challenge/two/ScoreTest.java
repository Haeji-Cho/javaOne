package workspace.chap09.src.challenge.two;

public class ScoreTest {
	static <T extends Comparable> T findBest(T[] a) {
		T best = a[0];

		for (int i = 0; i < a.length; i++)
			if (best.compareTo(a[i]) < 0)
				best = a[i];
		return best;
	}

	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("���", 77), new EnglishScore("�念��", 88), new EnglishScore("ȫ�浿", 99) };
		MathScore[] ma = { new MathScore("���", 80), new MathScore("�念��", 98), new MathScore("ȫ�浿", 70) };

		System.out.println("���� �ְ� ���� : " + findBest(ea));
		System.out.println("���� �ְ� ���� : " + findBest(ma));
	}
}
