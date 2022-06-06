package workspace.chap06.src.challenge.two;

class Girl {
	private String name;

	Girl() {
	}

	Girl(String name) {
		this.name = name;
	}

	void show() {
		System.out.println("�׳�� �ڹ� �ʺ����̴�.");
	}
}

class GoodGirl extends Girl {
	void show() {
		System.out.println("�׳�� �ڹٸ� �� �ȴ�.");
	}
}

class BestGirl extends GoodGirl {
	void show() {
		System.out.println("�׳�� �ڹٸ� �����ϰ� �� �ȴ�.");
	}
}

public class GirlTest {
	public static void main(String[] args) {
		Girl g1 = new Girl();
		Girl g2 = new GoodGirl();
		GoodGirl gg = new BestGirl();

		g2.show();
		gg.show();
	}
}