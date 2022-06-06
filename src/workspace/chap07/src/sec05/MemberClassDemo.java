package workspace.chap07.src.sec05;

public class MemberClassDemo {
	private String secret = "�����";
	String s = "�ܺ�";

	class MemberClass {
		String s = "����";

		public void show1() {
			System.out.println("���� Ŭ����");
			System.out.println(secret);

			System.out.println(s);

			System.out.println(MemberClassDemo.this.s);
		}

		// static String s3 = "���� ��� �ʵ�";
		// static void show2() {}
	}

	public static void main(String[] args) {
		MemberClassDemo m = new MemberClassDemo();
		MemberClassDemo.MemberClass m1 = m.new MemberClass();

		System.out.println(m1.s);
		m1.show1();
	}
}