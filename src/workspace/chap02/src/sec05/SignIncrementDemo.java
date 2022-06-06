package workspace.chap02.src.sec05;

public class SignIncrementDemo {
	public static void main(String[] args) {
		int plusOne = 1;
		int minusOne = -plusOne;
		System.out.println("plusOne�� " + plusOne + "�Դϴ�.");
		System.out.println("minusOne�� " + minusOne + "�Դϴ�.");

		int x = 1, y = 1;
		System.out.println("x = " + x + ", ++x = " + ++x);
		System.out.println("y = " + y + ", y++ = " + y++);
		System.out.println("x = " + x + ", y = " + y);
	}
}