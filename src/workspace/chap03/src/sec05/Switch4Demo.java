package workspace.chap03.src.sec05;

public class Switch4Demo {
    public static void main(String[] args) {
        show("ȣ����");
        show("����");
        show("����");
        show("������");
    }

    static void show(String bio) {
        String kind = switch (bio) {
            case "ȣ����", "����" -> "������";
            case "������", "����" -> "����";
            case "����", "����" -> "���";
            default -> {
                System.out.print("������! ");
                yield "...";
            }
        };
        System.out.printf("%s�� %s�̴�.\n", bio, kind);
    }
}
