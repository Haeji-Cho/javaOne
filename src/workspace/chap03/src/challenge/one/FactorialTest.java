package workspace.chap03.src.challenge.one;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);

		System.out.print("���丮�� ���� ���� ���� : ");
		n = in.nextInt();

		result = 1;
		// while (n > 0) {
		// result *= n--;
		// }

		while (true) {
			if (n > 0)
				result *= n--;
			else
				break;
		}
		System.out.println(result);
	}

}
