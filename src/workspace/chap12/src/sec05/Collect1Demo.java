package workspace.chap12.src.sec05;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect1Demo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream();
        Double avg = sn
                .collect(Collectors.averagingDouble(Nation::getPopulation));
        System.out.println("�α� ��� : " + avg);

        sn = Nation.nations.stream();
        Long num = sn.collect(Collectors.counting());
        System.out.println("���� ���� : " + num);

        sn = Nation.nations.stream();
        String name1 = sn.limit(4)
                .map(Nation::getName)
                .collect(Collectors.joining("-"));
        System.out.println("4�� ����(��� 1) : " + name1);

        sn = Nation.nations.stream();
        String name2 = sn.limit(4)
                .collect(Collectors.mapping(Nation::getName,
                        Collectors.joining("+")));
        System.out.println("4�� ����(��� 2) : " + name2);

        sn = Nation.nations.stream();
        Optional<Double> max = sn
                .map(Nation::getPopulation)
                .collect(Collectors.maxBy(Double::compare));
        System.out.println("�ִ� �α� ������ �α� �� : " + max);

        sn = Nation.nations.stream();
        IntSummaryStatistics sta = sn
                .collect(Collectors.summarizingInt(x -> x.getGdpRank()));
        System.out.println(sta);
    }
}