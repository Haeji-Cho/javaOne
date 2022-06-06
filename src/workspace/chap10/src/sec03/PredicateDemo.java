package workspace.chap10.src.sec03;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        IntPredicate even = x -> x % 2 == 0;
        System.out.println(even.test(3) ? "¦��" : "Ȧ��");

        IntPredicate one = x -> x == 1;
        IntPredicate oneOrEven = one.or(even);
        System.out.println(oneOrEven.test(1) ?
                "1 Ȥ�� ¦��" : "1�� �ƴ� Ȧ��");

        Predicate<String> p = Predicate.isEqual("Java Lambda");
        System.out.println(p.test("Java Lambda"));
        System.out.println(p.test("JavaFX"));

        BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
        System.out.println(bp.test(2, 3));
    }
}
