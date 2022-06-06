package workspace.chap11.src.sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = List.of("�׷���", "�ҳ�Ÿ", "�ƹ���", "���׽ý�", "�ҿ�");

        System.out.println(list.indexOf("�ҳ�Ÿ"));
        System.out.println(list.contains("��Ÿ��"));

        List<String> cars1 = new ArrayList<>(list);
        cars1.add("��Ÿ��");
        List<String> cars2 = new ArrayList<>(list);
        cars2.remove("���׽ý�");
        System.out.println(cars1.containsAll(cars2));

        cars1.removeIf(c -> c.startsWith("��"));
        cars1.replaceAll(s -> "��" + s);
        cars1.forEach(s -> System.out.print(s + " "));
        System.out.println();

        cars1.clear();
        System.out.println(cars1.isEmpty());
    }
}
