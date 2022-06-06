package workspace.chap09.src.sec02;

public class TryCatch1Demo {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			System.out.println("������ ���� => " + array[3]);
			System.out.println("ù ��° ���� => " + array[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���Ұ� �������� �ʽ��ϴ�.");
		}
		System.out.println("������!!!");
	}
}