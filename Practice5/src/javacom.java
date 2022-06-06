import java.util.Scanner;

public class javacom {
    public static void main(String[] args) {
        String a;
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        String b = new String("java");
        String c = new String("com");
        String d = new String("bye");


       /* for(int i = 0; i < size; i++){
            System.out.print("입력");
            a[i] = in.next();
        }
        for(int i = 0; i < size; i++){
            System.out.println("값: " + a[i] );
        }
*/
        System.out.println(a.contains(b));
        System.out.println(a.endsWith(c));

    }
}
