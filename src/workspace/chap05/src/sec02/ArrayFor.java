package workspace.chap05.src.sec02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo { //동적 배열
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>(); //키보드로 몇 개의 배열을 입력받을지 모를때
		int data;
		int sum = 0;

		while ((data = in.nextInt()) >= 0) //data입력 수가 1일 때만 계속 받겠다 음수 입력하면 프로그램 끝남
			scores.add(data);

		for(final e : scores)  //foreach문장, final있어도 되고 없어도 상관 없음
			sum += e; //내용 가져오기 get

		System.out.println("평균은 = " + (double)sum / scores.length());
	}
}