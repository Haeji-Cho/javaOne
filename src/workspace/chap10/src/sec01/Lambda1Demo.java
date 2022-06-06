package workspace.chap10.src.sec01;

import java.util.Arrays;

public class Lambda1Demo {
    public static void main(String[] args) {
        String[] strings = { "�θ��� ���� �θ����� ������.", "�ð��� ���̴�.", "���� Į���� ���ϴ�." };

        Arrays.sort(strings, (first, second) -> first.length() - second.length());

        for (String s : strings)
            System.out.println(s);
    }
}