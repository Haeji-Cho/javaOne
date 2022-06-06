package workspace.chap07.src.sec01;

public class AbstractClassDemo {
	public static void main(String[] args) {
		// Shape s = new Shape();

		Circle c = new Circle(3);
		c.draw();
		System.out.printf("���� ���̴� %.1f\n", c.findArea());

		Rectangle r = new Rectangle(3, 4);
		r.draw();
		System.out.printf("�簢���� ���̴� %.1f\n", r.findArea());
	}
}