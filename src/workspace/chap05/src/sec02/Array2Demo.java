package workspace.chap05.src.sec02;

public class Array2Demo {
	public static void main(String[] args) {
		double[][] interests = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } };
		double[] sum1 = { 0.0, 0.0, 0.0 }; //3행 초기화
		double sum2 = 0.0;

		for (int i = 0; i < interests.length; i++) { //행을 반복 3번
			for (int j = 0; j < interests[i].length; j++) { //작은 배열 부분 반복문 열을 반복  4번
				sum1[i] += interests[i][j];
			}

			System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", i + 1, sum1[i] / 4);
			sum2 += sum1[i];
		}
		System.out.printf("3년간 평균 이자율 = %.2f%%\n", sum2 / (3 * 4)); //2째 소숫점자리까지 출력
	}
}