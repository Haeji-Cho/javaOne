package workspace.chap07.src.sec03;

interface Portable {
	void inMyBag();
}

public class Notebook extends Computer implements Portable {
	public void inMyBag() {
		System.out.println("��Ʈ���� ���濡 �ִ�.");
	}

	public void turnOn() {
		System.out.println("��Ʈ���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("��Ʈ���� ����.");
	}

	public static void main(String[] args) {
		Notebook n = new Notebook();

		n.turnOn();
		n.turnOff();
		n.inMyBag();
	}
}