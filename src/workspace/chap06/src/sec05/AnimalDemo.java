package workspace.chap06.src.sec05;

class Animal {
	public Animal(String s) {
		System.out.println("���� : " + s);
	}
}

class Mammal extends Animal {
	public Mammal() {
		// super();
		super("������");
		System.out.println("������ : ������");
	}

	public Mammal(String s) {
		super(s);
		System.out.println("������ : " + s);
	}
}

public class AnimalDemo {
	public static void main(String[] args) {
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("����");
	}
}