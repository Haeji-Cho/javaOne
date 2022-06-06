package workspace.chap03.src.sec06;

public class IncrementDemo {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment() �޼��带 ȣ���ϱ� ���� x�� " + x);
		increment(x);
		System.out.println("increment() �޼��带 ȣ���� ���� x�� " + x);
	}

	public static void increment(int n) {
		System.out.println("increment() �޼��带 ������ ���� n�� " + n);
		n++;
		System.out.println("increment() �޼��尡 ���� ���� n�� " + n);
	}
}
