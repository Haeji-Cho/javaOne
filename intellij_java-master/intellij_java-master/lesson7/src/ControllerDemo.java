public class ControllerDemo {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.turnOff();
        tv.turnOn();
        Controller.reset();

        tv.repair();

        Controller[] controllers = {
                new TV(), new NoteBookDemo()};
        for (Controller c : controllers) {
            c.repair();
            c.turnOff();
            c.turnOn();
        }

        Controller.reset();

    }
}








