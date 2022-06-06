public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(19);
        person.setName("김누구");
        person.show();

        person.setName("김땡땡").setAge(20).show();
    }
}

class Person{
    private String name;
    private int age;

    Person setName(String name){
        this.name = name;
        return this;
    }

    Person setAge(int age){
        this.age = age;
        return this;
    }

    void show(){
        System.out.println("나는 " + age + "살인 "+ name +"입니다.");
    }
}
