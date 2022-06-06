package workspace.chap07.src.sec01;

class Rectangle extends Shape {
	int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.println("�簢���� �׸���.");
	}

	public double findArea() {
		return width * height;
	}
}