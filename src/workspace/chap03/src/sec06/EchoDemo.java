package workspace.chap03.src.sec06;

public class EchoDemo {
	public static void main(String[] args) {
		echo("�ȳ�!", 3);
	}

	public static void echo(String s, int n) {
		for (int i = 0; i < n; i++)
			System.out.println(s);
	}
}