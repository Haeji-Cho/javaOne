package workspace.chap07.src.sec01;

class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("���� �׸���.");
	}

	public double findArea() {
		return pi * radius * radius;
	}
}