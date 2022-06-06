package workspace.chap06.src.challenge.three;

class Girl {
	protected String name;

	Girl(String name) {
		this.name = name;
	}

	void show() {
		System.out.println("�׳�� �ڹ� �ʺ����̴�.");
	}
}

class GoodGirl extends Girl {

	GoodGirl(String name) {
		super(name);
	}

	void show() {
		System.out.println(name + "�� �ڹٸ� �� �ȴ�.");
	}
}

class BestGirl extends GoodGirl {

	BestGirl(String name) {
		super(name);
	}

	void show() {
		System.out.println(name + "�� �ڹٸ� �����ϰ� �� �ȴ�.");
	}
}

public class GirlTest {
	public static void main(String[] args) {
		Girl[] girls = { new Girl("������"), new GoodGirl("����"), new BestGirl("Ȳ����") };

		for (Girl g : girls)
			g.show();
	}
}