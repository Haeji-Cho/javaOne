package workspace.chap12.src.challenge.three;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MemberDemo {
    static int i = 0;
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

        ss = names.stream();
        Stream<Member> sm = ss.map(n -> new Member(n, genders.get(i), ages.get(i++)));
        sm.forEach(m -> System.out.print(m + " "));
        System.out.println();

        i = 0;
        ss = names.stream();
        sm = ss.map(n -> new Member(n, genders.get(i), ages.get(i++)));
        Map<Gender, List<Member>> map = sm.collect(Collectors.groupingBy(Member::getGender));
        System.out.println(map);
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

    @Override
    public String toString() {
        return String.format("Member(%s, %s, %d)", name, gender, age);
    }
}
