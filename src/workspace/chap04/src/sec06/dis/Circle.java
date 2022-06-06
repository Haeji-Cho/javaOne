package workspace.chap04.src.sec06.dis;

class Circle {
	double radius;
	String color;

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public Circle(double radius) {
		this(radius, "�Ķ�");
	}

	public Circle(String color) {
		this(10.0, color);
	}

	public Circle() {
		this(10.0, "����");
	}
}