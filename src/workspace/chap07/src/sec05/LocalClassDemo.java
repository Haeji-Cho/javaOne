package workspace.chap07.src.sec05;

public class LocalClassDemo {
	private String s1 = "�ܺ�";

	void method() {
		int x = 1;
		class LocalClass {
			String s2 = "����";
			String s3 = s1;

			public void show() {
				System.out.println("���� Ŭ����");
				// x = 2;
			}
		}

		LocalClass lc = new LocalClass();
		System.out.println(lc.s2);
		lc.show();
	}

	public static void main(String[] args) {
		LocalClassDemo lcd = new LocalClassDemo();
		lcd.method();
	}
}