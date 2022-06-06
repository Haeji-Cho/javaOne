package sec1;

public class OverTypeDemo {
    public static void main(String[] args) {

        Person p = new Student();
        System.out.println(p.name); //p가 가리키는 객체는 student이다.
        p.Whoami(); //student의 객체 받음
        Person.work(); //person


        Person[] persons = {new Person(), new Student(), new ForeignStudent()};
        for (Person person: persons)
            person.Whoami();    //다형성이 아니면 if else문장을 사용해야 한다. instanseof를 사용해서
    }
}
