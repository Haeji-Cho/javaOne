public class TalkableTest {
    static void speak(sound Korean){
        Korean.say();
    }
    public static void main(String[] args) {

        speak(new Korean());
        speak(new America());


    }
}

interface sound{
    void say();
}
class Korean implements sound{
    @Override
    public void say() {
        System.out.println("안녕하세요");
    }
}

class America implements sound{
    @Override
    public void say() {
        System.out.println("HI");
    }
}