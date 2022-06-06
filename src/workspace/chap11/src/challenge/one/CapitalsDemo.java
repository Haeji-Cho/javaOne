package workspace.chap11.src.challenge.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CapitalsDemo {
    public static void main(String[] args) {
        List<String> capitals = new ArrayList<>();
        capitals.add("����");
        capitals.add("������");
        capitals.add("����¡");
        capitals.add("�ĸ�");
        capitals.add("���帮��");

        for (String capital : capitals)
            System.out.print(capital + " ");
        System.out.println();

        capitals.add("����");
        Iterator<String > i = capitals.iterator();
        while(i.hasNext())
            System.out.print(i.next() + " ");
        System.out.println();

        capitals.removeIf(s -> s.length() > 2);
        capitals.forEach(s -> System.out.print(s + " "));
    }
}
