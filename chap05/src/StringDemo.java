import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hi, Java";
        String s2 = "Hi, java";
        String s3 = new String("Hi, Java");
        String s4 = new String("Hi, Java");
        String s5 = "Hi, Kotlin";

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s3 == s4); //false

        s1 = s3;
        System.out.println(s1 == s3); //true

        System.out.println(s1.equals(s4)); //true
        System.out.println(s1.equals(s5)); //false
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        System.out.println(s1.compareTo(s3)); //0  값이 같다
        System.out.println(s1.compareTo(s5)); //-1 J가 K보다 한자리 앞에 있어서 음수
        System.out.println(s1.compareTo(s2)); //-32 대문자와 소문자의 차이
        System.out.println(s1.compareToIgnoreCase(s2)); //0  대소문자 비교하지 않으면 같음


        String a1 = new String("Hi,");
        String a2 = new String(" Java");

        System.out.println(s1.length());
        char c = a1.charAt(1);
        System.out.println(c);

        a1 = a1.concat(a2); //a1 = a1 + a2;
        String a3 = a1.toLowerCase();
        String a4 = a1.substring(3, 6);
        String a5 = a2.trim();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        int i = 8; //정수 +가 앞에 오냐 뒤에 오냐에 따라 값이 달라짐
        System.out.println("Java "+ i +1); //Java 81
        System.out.println(i + 1 +"Java"); //9Java

        String version = String.format("%s %d\n", "Java", 14);
        System.out.println(version); //Java 14

        String fruits = String.join("-", "apple", "banana", "cherry");
        System.out.println(fruits); //apple-banana-cherry
    }
}
