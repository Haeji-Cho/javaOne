package workspace.chap04.src.challenge.three;

class Printer {
	int numOfPapers;
	boolean duplex;

	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}

	public void print(int amount) {
		if (getDuplex()) {
			amount = (amount % 2 == 0) ? amount / 2 : amount / 2 + 1;
			System.out.print("������� ");
		} else
			System.out.print("�ܸ����� ");

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

	public boolean getDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}

public class PrinterTest {
	public static void main(String[] args) {
		Printer p = new Printer(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}
}