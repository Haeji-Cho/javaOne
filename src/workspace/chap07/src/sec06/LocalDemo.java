package workspace.chap07.src.sec06;

public class LocalDemo {
	public static void main(String[] args) {
		class Eagle extends Bird {
			public void move() {
				System.out.println("�������� ����~~~.");
			}
		}

		Bird e = new Eagle();
		e.move();
	}
}