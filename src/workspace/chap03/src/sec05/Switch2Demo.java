package workspace.chap03.src.sec05;

public class Switch2Demo {
	public static void main(String[] args) {
		whoIsIt("ȣ����");
		whoIsIt("����");
		whoIsIt("����");
		whoIsIt("������");
	}

	static void whoIsIt(String bio) {
		String kind = "";
		switch (bio) {
			case "ȣ����":
			case "����":
				kind = "������";
				break;
			case "������":
			case "����":
				kind = "����";
				break;
			case "����":
			case "����":
				kind = "���";
				break;
			default:
				System.out.print("������! ");
				kind = "...";
		}
		System.out.printf("%s�� %s�̴�.\n", bio, kind);
	}
}