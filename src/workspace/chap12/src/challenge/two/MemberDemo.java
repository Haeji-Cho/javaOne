package workspace.chap12.src.challenge.two;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MemberDemo {
    public static void main(String[] args) {
        List<String> names = List.of("ȫ�浿", "����ȭ", "�Ӳ���", "�����", "�輱��", "Ȳ����");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.��, Gender.��, Gender.��, Gender.��, Gender.��, Gender.��);

        Stream<String> ss = names.stream();
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
        System.out.println();

        Stream<Integer> si = ages.stream();
        System.out.println(si.reduce(0, (a, b) -> a + b));
        si = ages.stream();
        System.out.println(si.max(Integer::compareTo).get());
        IntStream is = ages.stream().mapToInt(a -> a.intValue());
        System.out.println(is.average().getAsDouble());
    }
}

enum Gender {
    ��, ��
}

class Member {
    String name;
    Gender gender;
    int age;

    public Member(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
