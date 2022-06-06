public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);

        System.out.println("원의 개수(c1) = "+ c1.inum);
        System.out.println("원의 개수(s1) = "+ Circle.snum); //기원 전에 만들었기 때문에 c1과 같다

        Circle c2 = new Circle(2.0);

        System.out.println("원의 개수(c2) = "+ c2.inum);
        System.out.println("원의 개수(s2) = "+ c2.snum);
        System.out.println("원의 개수(s3) = "+ c1.snum);

       //sayHello(); main이 기원 전에 만들어졌기 때문에 오류발생

        CircleDemo cd = new CircleDemo(); //이렇게 만들면 가능
        cd.sayHello();
    }
    void sayHello(){
        System.out.println("안녕");
    }
}

class Circle{
    double radius;
    int inum;
    static int snum;

    public Circle(double radius) { //shift+Insert누르기
        this.radius = radius;
        inum++;
        snum++;
    }
}