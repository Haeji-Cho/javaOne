import java.sql.Struct;

public class PersonTest {
    public static void main(String[] args) {
        Person[] persons = {new Person("길동이", 22),
        new Student("황진이", 23, 100),
        new ForeignStudent("Amy", 30, 200, "USA")};

        for (Person p :persons)
            System.out.println(p.show());
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    String show(){
        return String.format("사람(%s, %d)" , name, age);

    }
}

class Student extends Person{
    private int sn;

    public Student(String name, int age, int sn) {
        super(name, age);
        this.sn = sn;
    }

    public int getSn() {
        return sn;
    }
    String show() {
        return String.format("학생(%s, %d, %d)", getName(), getAge(), sn); //private이기 때문에 getName

    }
}

class ForeignStudent extends Student{
    private String nationality;

    public ForeignStudent(String name, int age, int sn, String nationality) {

        super(name, age, sn);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    String show(){
        return String.format("외국학생(%s, %d, %d, %s)", getName(), getAge(), getSn(), nationality);
    }
}