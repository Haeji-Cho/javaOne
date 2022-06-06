package workspace.chap06.src.challenge.one;

class Girl {
	String name;
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

		// g2.show();
		gg.show();
	}
}