package workspace.chap12.src.challenge.one;

import java.util.List;
import java.util.stream.Stream;

public class MemberDemo {
    public static void main(String[] args) {
        Stream<String> ss;
        List<String> names = List.of("ȫ�浿", "����ȭ", "�Ӳ���", "�����", "�輱��", "Ȳ����");

        ss = names.stream();
        ss.filter(n -> n.charAt(0) < '��').forEach(n -> System.out.print(n + " "));
        System.out.println();
        ss = names.stream();
        ss.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
        ss = names.stream();
        System.out.println(ss.findFirst());
        ss = names.stream();
        System.out.println(ss.findFirst().get());
        ss = names.stream();
        System.out.println(ss.count());
    }
}
