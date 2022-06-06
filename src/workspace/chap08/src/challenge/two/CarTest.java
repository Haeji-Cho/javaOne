package workspace.chap08.src.challenge.two;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Car {
	private String model;

	public Car(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "[" + model + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car)
			return model.equals(((Car) obj).model);
		else
			return false;
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

		SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy");
		String s = MessageFormat.format("��¥: {0}, �ڵ��� ��={1}, ������({2})", f.format(new Date()), myCar, "ȫ�浿");
		System.out.println(s);

	}
}