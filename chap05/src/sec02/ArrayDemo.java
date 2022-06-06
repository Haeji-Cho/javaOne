package sec02; //package가 가장 먼저 나옴

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0; //무조건 초기화 해야함

        for (int i = 0; i < scores.length; i++){
            scores[i] = in.nextInt();
        }
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        System.out.println("avg = " + (double)sum / scores.length);
    }
}
