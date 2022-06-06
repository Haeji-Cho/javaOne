package workspace.chap05.src.challenge.two;

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
		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}

		System.out.println(numOfStudents + "���� �л� ������ ������ �����ϴ�.");
		for (int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 90)
				System.out.println((i + 1) + "�� �л��� ����� A�Դϴ�.");
			else if (scores[i] >= 80)
				System.out.println((i + 1) + "�� �л��� ����� B�Դϴ�.");
			else if (scores[i] >= 70)
				System.out.println((i + 1) + "�� �л��� ����� D�Դϴ�.");
			else if (scores[i] >= 60)
				System.out.println((i + 1) + "�� �л��� ����� E�Դϴ�.");
			else
				System.out.println((i + 1) + "�� �л��� ����� F�Դϴ�.");
		}
	}

}
