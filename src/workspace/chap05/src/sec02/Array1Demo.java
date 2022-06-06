package workspace.chap05.src.sec02;

import java.util.Scanner;

public class Array1Demo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;

		for (int i = 0; i < scores.length; i++)
			scores[i] = in.nextInt(); //배열에 입력

		for (int i = 0; i < scores.length; i++)
			sum += scores[i]; //sum으로 합산

		System.out.println("평균값 = " + sum / 5.0);
	}
}