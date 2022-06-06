import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("학생 수? ");
        int numOfStudents = 0;
        numOfStudents = in.nextInt();
        int[] scores = {numOfStudents};

        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요");
        for(int i = 0; i < scores.length; i++){
            scores[i] = in.nextInt();
        }
        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i]);
        }
    }
}



