package workspace.chap12.src.sec04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map3Demo {
    public static void main(String[] args) {
        List<String> list1 = List.of("�ȳ�, �ڹ�!", "�� ��, C++!");
        Stream<String> s1 = list1.stream();
        Stream<String> s2 = s1.flatMap(s -> Arrays.stream(s.split(" ")));
        s2.forEach(Util::printWithParenthesis);
        System.out.println();

        List<String> list2 = List.of("���� ��ħ");
        List<String> list3 = List.of("�ȳ�! ����", "ȯ��! ��Ʈ��");

        Stream<List<String>> s3 = Stream.of(list1, list2, list3);
        Stream<String> s4 = s3.flatMap(list -> {
            if (list.size() > 1)
                return list.stream();
            else
                return Stream.empty();
        });
        s4.forEach(Util::printWithParenthesis);
    }
}