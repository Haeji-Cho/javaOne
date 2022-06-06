package workspace.chap11.src.sec03;

import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> fruits =
                Map.of("���", 5, "�ٳ���", 3, "����", 10, "����", 1);
        System.out.println(fruits.size() + "������ ������ �ֽ��ϴ�.");
        System.out.println(fruits);

        for (String key : fruits.keySet())
            System.out.println(key + "�� " + fruits.get(key) + "�� �ֽ��ϴ�.");

        String key = "�ٳ���";
        if (fruits.containsKey(key))
            System.out.println(key + "�� " + fruits.get(key) + "�� �ֽ��ϴ�.");

        fruits.forEach((k, n) -> System.out.print(k + "(" + n + ") "));

//        fruits.put("Ű��", 2);
//        fruits.remove("���");
//        fruits.clear();
    }
}
