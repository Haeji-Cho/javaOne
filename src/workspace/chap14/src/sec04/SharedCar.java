package workspace.chap14.src.sec04;

import java.util.Random;

public class SharedCar {
	public synchronized void drive(String name, String where) {
		System.out.println(name + "���� �ڵ����� �����ϴ�.");
		Random r = new Random();
		for (int i = 0; i < r.nextInt(3) + 1; i++)
			System.out.println(name + "���� �ڵ����� �����մϴ�.");
		System.out.println(name + "���� " + where + "�� �����߽��ϴ�.");
	}
}