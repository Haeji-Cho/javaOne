package workspace.chap05.src.sec02;

public class ArrayListDemo { //method 인수 전달


	public static void main(String[] args) {
		if (args.length == 2) {
			int i = Integer.parseInt(args[1]);
		} else
			System.out.println("oops");
	}

	static void nPrint(String s, int i) {
		for (int n = 0; n < i; n++)
			System.out.println(s);
	}
}

