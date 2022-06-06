package workspace.chap14.src.sec04;

class CarThread extends Thread {
	private String who;
	private SharedCar car;
	private String where;

	public CarThread(String who, SharedCar car, String where) {
		this.who = who;
		this.car = car;
		this.where = where;
	}

	public void run() {
		car.drive(who, where);
	}
}

public class SynchroDemo {
	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		new CarThread("������", car, "����").start();
		new CarThread("������", car, "�λ�").start();
		new CarThread("������", car, "����").start();
	}
}