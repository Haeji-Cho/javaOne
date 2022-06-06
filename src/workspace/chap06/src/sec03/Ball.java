package workspace.chap06.src.sec03;

public class Ball extends Circle {
	private String color;

	public Ball(String color) {
		this.color = color;
	}

	public void findColor() {
		System.out.println(color + " ���̴�.");
	}

	public void findArea() {
		System.out.println("���̴� 4*(��*������*������)�̴�.");
	}

	public void findVolume() {
		System.out.println("���Ǵ� 4/3*(��*������*������*������)�̴�.");
	}
}