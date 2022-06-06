package workspace.chap05.src.sec04.two;

public class EnumDemo {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        if (gender == Gender.MALE)
            System.out.println(Gender.MALE + "�� ���� �ǹ��� �ִ�.");
        else
            System.out.println(Gender.FEMALE + "�� ���� �ǹ��� ����.");

        for(Gender g : Gender.values())
            System.out.println(g.name());

        System.out.println(Gender.valueOf("MALE"));
    }
}

enum Gender {
    MALE("����"), FEMALE("����");

    private String s;

    Gender(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}