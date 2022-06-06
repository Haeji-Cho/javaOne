public class TV implements Controller{

    @Override
    public void turnOn() {
        System.out.println("티비를 켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 끄디");
    }

    @Override
    public void repair() {
        System.out.println("티비를 수리하다.");;
    }
}
