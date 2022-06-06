import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HistoTest {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] freq = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //10개의 배열 0으로 초기화

        int x = 0; //배열 값 저장하는 장소
        for(int i = 0; i < freq.length; i++){
            x = in.nextInt();
            if(x > 0)
                freq[x/ freq.length]++; //10의 자리 수로 배열 나누기 39면 index 3번 ++, 18이면 index 1번 ++
        }

        for (int i = 0; i < freq.length; i++){
            System.out.printf("%2d ~ %2d : ", i * 10, (i + 1) * 10 - 1); //0~9, 10~19, 20~29...
            for (int k = 0; k < freq[i]; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
