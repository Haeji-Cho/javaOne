import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        int numOfStudent = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);

        System.out.println("학생 수는?");
        numOfStudent = in.nextInt();
        scores = new int[numOfStudent];

        System.out.println(numOfStudent + "명의 학생 성적을 입력하세요: ");
        for(int i = 0; i < scores.length; i++){
            scores[i] = in.nextInt();
        }

        System.out.println(numOfStudent + "명의 학생 성적은 다음과 같습니다.");
        for (int i = 0; i < scores.length; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < scores.length; i++){
            if(scores[i] > 90)
                System.out.printf("%d번 학생의 등급은 %s입니다.", i+1, "A");
            else if(scores[i] >= 80)
                System.out.printf("%d번 학생의 등급은 %s입니다.", i+1, "B");
            else if(scores[i] >= 70)
                System.out.printf("%d번 학생의 등급은 %s입니다.", i+1, "C");
            else System.out.printf("F입니다.");
        }
    }
}
