package workspace.chap02.src.sec04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d * %d�� %d�Դϴ�.\n", x, y, x * y);
	}
}