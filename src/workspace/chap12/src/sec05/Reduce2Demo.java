package workspace.chap12.src.sec05;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Reduce2Demo {
    public static void main(String[] args) {
        Stream<Nation> s1 = Nation.nations.stream();
        s1.reduce((n1, n2) -> n1.getPopulation() > n2.getPopulation() ? n1 : n2)
                .ifPresent(System.out::println);

        Stream<Nation> s2 = Nation.nations.stream();
        double sumOfPopulation = s2.filter(n -> n.getGdpRank() <= 20)
                .mapToDouble(n -> n.getPopulation())
                .reduce(0.0, (n1, n2) -> n1 + n2);
        System.out.println("����Ʈ���� GDP�� 20�� �̳��� ������ �α� ������ " +
                sumOfPopulation + "�鸸���̴�.");

        Stream<Nation> s3 = Nation.nations.stream();
        DoubleStream ds = s3.mapToDouble(Nation::getPopulation);
        DoubleSummaryStatistics dss = ds.summaryStatistics();
        System.out.println(dss);
    }
}