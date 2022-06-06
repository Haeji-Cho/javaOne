package workspace.chap03.src.sec02;

import java.util.Scanner;

public class SimpleIfDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int number = in.nextInt();

		if (number % 2 == 0)
			System.out.println("¦��!");
		if (number % 2 == 1)
			System.out.println("Ȧ��!");
		System.out.println("����");
	}
}