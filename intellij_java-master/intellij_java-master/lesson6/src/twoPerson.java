public class twoPerson {
    public static void main(String[] args) {
        Person p = new Person("길동이", 22);
        Student s = new Student("황진이", 23, 100);
        Foreign f = new Foreign("Amy", 30, 200, "usa");

        p.show();
        s.show();
        f.show();

        Person[] pp = {new Person("길동이", 22), new Student("황진이", 23, 100), new Foreign("Amy", 30, 200, "usa")};

    }
}
class Person{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void show(){
        System.out.printf("사람[이름 : %s, 나이 : %d]", name, age);
    }
}

class Student extends Person{
    int snum;

    Student(String name, int age, int snum) {
        super(name, age);
        this.snum = snum;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    void show(){
        System.out.printf("사람[이름 : %s, 나이 : %d, 학번 : %d]", name, age, snum);
    }
}

class Foreign extends Student{
    String country;

    Foreign(String name, int age, int snum, String country) {
        super(name, age, snum);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    void show(){
        System.out.printf("사람[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]", name, age, snum, country);
    }
}

