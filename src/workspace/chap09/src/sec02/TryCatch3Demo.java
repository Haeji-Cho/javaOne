package workspace.chap09.src.sec02;

public class TryCatch3Demo {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			int x = array[3];
		} catch (Exception e) {
			System.out.println("������!!!");
//		} catch (ArrayIndexOutOfBoundsException e) {
//					System.out.println("���Ұ� �������� �ʽ��ϴ�.");
		}
		System.out.println("����.");
	}
}