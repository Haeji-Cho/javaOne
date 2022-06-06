package workspace.chap09.src.challenge.three;

public class ScoreTest {
	static <T extends Comparable> T findBest(T[] a) {
		T best = a[0];

		for (int i = 0; i < a.length; i++)
			if (best.compareTo(a[i]) < 0)
				best = a[i];
		return best;
	}

	static <T> T findScore(T[] a, String name) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].toString().substring(0, 3).equals(name))
				return a[i];
		}
		return null;
	}

	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("���", 77), new EnglishScore("�念��", 88), new EnglishScore("ȫ�浿", 99) };
		MathScore[] ma = { new MathScore("���", 80), new MathScore("�念��", 98), new MathScore("ȫ�浿", 70) };
		String name = null;

		System.out.println("���� �ְ� ���� : " + findBest(ea));
		System.out.println("���� �ְ� ���� : " + findBest(ma));

		try {
			name = args[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����� ���ڰ� �����ϴ�.");
			return;
		}

		System.out.println("����       ���� : " + findScore(ea, name));
		System.out.println("����       ���� : " + findScore(ma, name));
	}
}
