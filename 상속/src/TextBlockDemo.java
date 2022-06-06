//public class TextBlockDemo {
//    public static void main(String[] args) {
//        String html1 = """
//             <html>
//                <p>Hi, world!</p>
//             </html>
//             """;
//        System.out.println(html1);
//        String html2 = """
//             <html>
//                <p>Hi, world!</p>
//             </html>
//        """;
//        System.out.println(html2);
//        String escape = """
//                \\""";
//        System.out.println(escape);
//        System.out.println();
//        String quote = """
//                안녕, "수정아!"
//                """;
//        System.out.println(quote);
//        String op = """
//                가나라""".replace("라", "다");
//        System.out.println(op);
//    }
//}

import java.util.Arrays;

public class TextBlockDemo {
    public static void main(String[] args) {
        char[] a1 = {'J', 'a', 'v', 'a'};
        char[] a2 = Arrays.copyOf(a1, a1.length); //전체를 복사하는 것이다.
        System.out.println(a2);

        String[] sa = {"케이크", "애플", "도넛", "바나나"};
        String[] s2 = Arrays.copyOf(sa, sa.length);
        print(sa);
        System.out.println(s2[2]);

        Arrays.sort(sa);
        System.out.println(Arrays.toString(sa));
        print(sa);

        System.out.println(Arrays.binarySearch(sa, "애플")); //애플이 몇 번재인지

        Arrays.fill(sa, 2, 4, "기타");
        print(sa);

    }
    static void print(Object[] oa){
        for(Object o: oa)
            System.out.print(o + " ");
        System.out.println();
    }
}