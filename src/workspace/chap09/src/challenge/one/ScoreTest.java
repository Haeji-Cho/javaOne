package workspace.chap09.src.challenge.one;

public class ScoreTest {
	static EnglishScore findBest(EnglishScore[] a) {
		EnglishScore best = a[0];

		for (int i = 0; i < a.length; i++)
			if (best.compareTo(a[i]) < 0)
				best = a[i];
		return best;
	}

	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("���", 77), new EnglishScore("�念��", 88), new EnglishScore("ȫ�浿", 99) };

		System.out.println("���� �ְ� ����: " + findBest(ea));
	}
}
