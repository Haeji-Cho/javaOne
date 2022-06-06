package workspace.chap11.src.sec03;

import java.util.HashMap;
import java.util.Map;

public class HashMap1Demo {
    public static void main(String[] args) {
        Map<String, Integer> map =
            Map.of("���", 5, "�ٳ���", 3, "����", 10, "����", 1);

        Map<String, Integer> fruits = new HashMap<>(map);
        fruits.put("��", 2);
        System.out.println("���� " + fruits.size() + "������ ������ �ֽ��ϴ�.");
        fruits.remove("�ٳ���");
        System.out.println("�ٳ����� ���� �� " + fruits.size() + "������ ������ �ֽ��ϴ�.");

        fruits.put("����", 2);
        System.out.println("���� �߰��� �� ���� " + fruits + "�� �ֽ��ϴ�.");

        fruits.clear();
        System.out.println("��� ���� �� " + fruits.size() + "������ ������ �ֽ��ϴ�.");
    }
}