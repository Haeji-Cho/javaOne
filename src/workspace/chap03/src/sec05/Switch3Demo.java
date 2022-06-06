package workspace.chap03.src.sec05;

public class Switch3Demo {
    public static void main(String[] args) {
        show("ȣ����");
        show("����");
        show("����");
        show("������");
    }

    static void show(String bio) {
        String kind = "...";
        switch (bio) {
            case "ȣ����", "����" -> kind = "������";
            case "������", "����" -> kind = "����";
            case "����", "����" -> kind = "���";
            default -> System.out.print("������! ");
        }
        System.out.printf("%s�� %s�̴�.\n", bio, kind);
    }
}
