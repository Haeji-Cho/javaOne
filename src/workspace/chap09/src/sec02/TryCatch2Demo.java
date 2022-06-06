package workspace.chap09.src.sec02;

public class TryCatch2Demo {
	public static void main(String[] args) {
		int dividend = 10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���Ұ� �������� �ʽ��ϴ�.");
		} catch (NumberFormatException e) {
			System.out.println("���ڰ� �ƴմϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			System.out.println("�׻� ����˴ϴ�.");
		}
		System.out.println("����.");
	}
}