package workspace.chap10.src.sec01;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        String[] strings = { "�θ��� ���� �θ����� ������.",
                "�ð��� ���̴�.", "���� Į���� ���ϴ�." };

        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String first, String second) {
                return first.length() - second.length();
            }
        });

        for (String s : strings)
            System.out.println(s);
    }
}