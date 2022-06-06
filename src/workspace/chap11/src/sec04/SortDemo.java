package workspace.chap11.src.sec04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        String[] fruits = {"����", "����", "���", "Ű��", "����"};
        List<String> list = Arrays.asList(fruits);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
