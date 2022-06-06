package workspace.chap03.src.sec05;

public class Switch5Demo {
    public static void main(String[] args) {
        System.out.println(howMany(1) + " �ִ�.");
        System.out.println(howMany(2) + " �ִ�.");
        System.out.println(howMany(3) + " �ִ�.");
    }

    static String howMany(int n) {
        return switch (n) {
            case 1  -> "�Ѱ�";
            case 2  -> "�ΰ�";
            default -> "����";
        };
    }
}
