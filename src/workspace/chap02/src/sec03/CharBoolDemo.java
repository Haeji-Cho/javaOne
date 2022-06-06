package workspace.chap02.src.sec03;

public class CharBoolDemo {
    public static void main(String[] args) {
        char ga1 = 'm';
        char ga2 = '\uac00';

        boolean cham = true;
        boolean geojit = false;

        System.out.println(ga1);
        System.out.println((int)ga1);
        System.out.println(ga2);
        System.out.println(++ga2);
        System.out.println(cham + "�� �ƴϸ� " + geojit + "�Դϴ�.");
    }
}
