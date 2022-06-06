package workspace.chap03.src.challenge.two;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);

		System.out.print("���丮�� ���� ���� ���� : ");
		n = in.nextInt();

		result = factorial(n);
		System.out.println(result);
	}

	static int factorial(int x) {
		int r = 1;
		while (x > 0) {
			r *= x--;
		}
		return r;
	}
}
