package sec1;

public class CastDemo {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();

        p = s; //p가 가리키는 객체는 s이다.
        //s = p; 이것은 불가능  부모 타입을 자식 타입에 mapping하는 것은 안된다.
        //but
        Student s2 = (Student)p; //이렇게는 가능하다.

        System.out.println(s instanceof Person);
        System.out.println(s instanceof Student);
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Student);  //위에서 p = s를 해줬으므로 true가 출력된다.

        downcast(s);
        downcast(p);
    }
    static void downcast(Person person){
        if(person instanceof Student) {
            Student s = (Student) person;
            System.out.println(s);
        }
        else
            System.out.println(person);

    }
}
