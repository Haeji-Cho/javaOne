package workspace.chap07.src.challenge.three;

abstract class Countable {
	String name;
	protected int num;

	abstract void count();

	public Countable(String name, int num) {
		this.name = name;
		this.num = num;
	}
}

class Bird extends Countable {
	public Bird(String name, int num) {
		super(name, num);
	}

	public void count() {
		System.out.println(name + "�� " + num + "���� �ִ�.");
	}

	public void fly() {
		System.out.println(num + "���� " + name + "�� ���ư���.");
	}
}

class Tree extends Countable {
	public Tree(String name, int num) {
		super(name, num);
	}

	public void count() {
		System.out.println(name + "�� " + num + "�׷� �ִ�.");
	}

	public void ripen() {
		System.out.println(num + "�׷� " + name + "�� ���Ű� �� �;���.");
	}
}

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = {new Bird("���ٱ�", 5), new Bird("������", 2),
				new Tree("�������", 10), new Tree("�㳪��", 7)};

		for (Countable e : m)
			e.count();

		for (int i = 0; i < m.length; i++) {
			if (m[i] instanceof Bird)
				((Bird) m[i]).fly();
			else
				((Tree) m[i]).ripen();
		}
	}
}
