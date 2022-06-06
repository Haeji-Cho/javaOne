import java.util.Scanner;

public class reverse1 {
    public static void main(String[] args) {

        //1번째 방법
        String input = "Hello";

        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);

        //2번째 방법
        String str = "Hello World";
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);

        //3번째 방법 for문 사용
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();

        for(int i = st.length()-1; i >= 0; i--){
            System.out.print(st.charAt(i));
        }

    }
}
