package workspace.chap04.src.challenge.two;

class Printer {
	private int numOfPapers = 0;

	public Printer(int numOfPapers) {
		this.numOfPapers = numOfPapers;
	}

	public void feed(int amount) {
		numOfPapers += amount;
	}

	public void print(int amount) {
		if (numOfPapers == 0)
			System.out.println("������ �����ϴ�.");
		else if (numOfPapers < amount) {
			System.out.printf("��� ����Ϸ��� ������ %d�� �����մϴ�. ", amount - numOfPapers);
			System.out.println(numOfPapers + "�常 ����մϴ�.");
			numOfPapers = 0;
		} else {
			numOfPapers -= amount;
			System.out.print(amount + "�� ����߽��ϴ�. ");
			System.out.println("���� " + numOfPapers + "�� �����ֽ��ϴ�.");
		}
	}
}

public class PrinterTest {
	public static void main(String[] args) {
		Printer p = new Printer(10);
		p.print(2);
		p.print(20);
		p.print(10);
	}
}