package workspace.chap03.src.sec03;

public class DoWhile2Demo {
	public static void main(String[] args) {
		int i = 10;
		do {
			i++;
		} while (i < 5);
		System.out.println("do~while �� ���� �� : " + i);

		i = 10;
		while (i < 5) {
			i++;
		}
		System.out.println("while �� ���� �� : " + i);
	}
}
