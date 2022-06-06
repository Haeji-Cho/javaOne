package workspace.chap08.src.challenge.one;

class Car {
	private String model;

	public Car(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "[" + model + "]";
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car("�׷���");
		Car yourCar = new Car("�׷���");

		if (myCar.equals(yourCar))
			System.out.printf("�ڵ��� ���� �Ѵ� %s�� �����ϴ�.\n", myCar);
		else
			System.out.printf("�� �ڵ����� %s, �� �ڵ����� %s�� ���� �ٸ���.\n", myCar, yourCar);
	}
}