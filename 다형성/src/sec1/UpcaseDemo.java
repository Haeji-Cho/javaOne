package sec1;

public class UpcaseDemo {
    public static void main(String[] args) {
        Person p;
        Student s = new Student();

        p = s; //자식 타입을 부모 타입에 mapping하는 것은 아무 문제가 없다.

        p.Whoami();
        //p.number(); 자식의 class이므로 불가능


    }
}
