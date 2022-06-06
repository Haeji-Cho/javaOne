package workspace.chap07.src.sec06;

public class MemberDemo {
	class Eagle extends Bird {
		public void move() {
			System.out.println("�������� ����~~~.");
		}

		public void sound() {
			System.out.println("����~~~.");
		}
	}

	Eagle e = new Eagle();

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();
		m.e.move();
		m.e.sound();
	}
}