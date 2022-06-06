package workspace.chap05.src.sec04;

public class ConstantDemo {
    public static void main(String[] args) {
        final int MALE = 0;
        final int FEMALE = 1;
        final int SOUTH = 1;
        int gender = FEMALE;
        if (gender == MALE)
            System.out.println(MALE + "��(��) ���� �ǹ��� �ִ�.");
        else
            System.out.println(FEMALE + "��(��) ���� �ǹ��� ����.");

        if (gender == SOUTH)
            System.out.println(SOUTH + "��(��) ����?");
        gender = 5;
    }
}
