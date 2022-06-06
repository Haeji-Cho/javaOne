import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("철수: ");
        String a = in.next();
        System.out.println("영희: ");
        String b = in.next();

        if(a.equals("r") == b.equals("r") || a.equals("s") == b.equals("s") || a.equals("p") == b.equals("p"))
            System.out.println("무승부");
        if(a.equals("s") != b.equals("p") || a.equals("r") != b.equals("s") || a.equals("p") != b.equals("r"))
            System.out.println("철수 승");
        if(b.equals("s") != a.equals("p") || b.equals("r") != a.equals("s") || b.equals("p") != a.equals("r"))
            System.out.println("영희 승");
    }
}
