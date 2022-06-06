public class NoteBookDemo extends TV implements Portable{

    public static void main(String[] args) {
        NoteBookDemo notebook = new NoteBookDemo();
        notebook.turnOff();
        notebook.turnOn();
        notebook.repair();
        notebook.inMyBag();
    }
    @Override
    public void inMyBag() {

        System.out.println("노트북이 가방에 있다. ");
    }

    @Override
    public void turnOn() {

        System.out.println("노트북을 끄다. ");
    }

    @Override
    public void turnOff() {

        System.out.println("노트북을 켜다. ");
    }

    @Override
    public void repair() {

        System.out.println("노트북을 수리하다.");
    }
}

interface Portable{
    void inMyBag();
}