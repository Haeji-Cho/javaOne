package workspace.chap04.src.sec06.etc;

public class CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0);
		// Circle yourCircle = new Circle();
	}
}

class Circle {
	private double radius;

	public Circle(double r) {
		radius = r;
	}
}