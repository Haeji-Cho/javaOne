package workspace.chap07.src.sec03;

public class TV implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("TV�� �Ҵ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ����.");
	}
}