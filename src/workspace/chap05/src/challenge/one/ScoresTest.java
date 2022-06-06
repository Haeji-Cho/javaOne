package workspace.chap05.src.challenge.one;

import java.util.Scanner;

public class ScoresTest {

	public static void main(String[] args) {
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);

		System.out.print("�л� ��? ");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];

		System.out.println(numOfStudents + "���� �л� ������ �Է��ϼ���.");
		for (int i = 0; i < scores.length; i++)
			scores[i] = in.nextInt();

		System.out.println(numOfStudents + "���� �л� ������ ������ �����ϴ�.");
		for (int i = 0; i < scores.length; i++)
			System.out.print(scores[i] + " ");
	}
}
