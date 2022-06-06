package sec1;

public class Student extends Person{
    int number = 1;
    String name = "학생";

    static void work(){
        System.out.println("나는 공부한다. ");
    }

    @Override
    void Whoami() {
        super.Whoami();
    }
}
