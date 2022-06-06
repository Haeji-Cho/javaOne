package workspace.chap11.src.sec02;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> list = Arrays.asList("�ٶ���", "������","����");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + "-");
        System.out.println();

        while (iterator.hasNext())
            System.out.print(iterator.next() + "+");
        System.out.println();

        iterator = list.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + "=");
    }
}