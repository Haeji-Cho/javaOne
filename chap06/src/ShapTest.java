public class ShapTest {
    public static void main(String[] args) {
        //System.out.println(new Circle("원", 10));   //<-문자열로 변환되어 출력되기 때문에 그냥 10을 넣으면 원하는 수가 안나옴
        //박스나 원을 배열로 만들고 싶을 때 섞어서 쓰고 싶으면 부모를 활용해야 한다.
        Shape[] shapes = {
                new Circle("수정이", 10),
                new Box1("길동이", 20),
                new Circle("성신", 30)
        }; //실행문이면 ;을  넣고 아니면 넣지 말아야 한다.

        for (Shape s : shapes) {
            //System.out.println(s);  //처음 s는 수정이, 길동, 성신 순서로 출력
            if (s instanceof Circle s1)  //s1을 넣으면 sout에서 타입 변환을 하지 않아도 된다.
                System.out.println(s1.show());   //두 개의 타입을 맞춰줘야 한다.
            else
                System.out.println(((Box1)s).show());
            System.out.println(s.getName());  //타입이 shape이지만 box나 circle을 가리킬 수 있다.
        }
    }
}

class Shape {  //부모의 object가 이미 string이기 때문에 자식이 문자열 타입을 물려 받는다.
    String name;


    public Shape(String name) {
        this.name = name; }  //shape 뒤에 this는 정의된 객체를 가리킨다. 위의 shape 안의 길동, 성신.. 등


    public String getName() {
        //if문으로 확인도 가능하다.
        return name; //type이 맞는지 확인해 주어야 한다.
    }
}

class Circle extends Shape { //오류가 발생하는 이유 시험에 나올 수도
    private int radius;

    public Circle(String name, int radius) { //생성자는 항상 필요하다. member 변수는 private으로 하는 것이 일반적이다.
        super(name); //부모 클래스에서 물려받은 name이 super로 가장 먼저 와야한다.
        this.radius = radius;
    }

    public int getRadius() {  //private으로 하면 get이 필요하다.
        return radius;
    }

    String show() {
        return "빨간 원";
    }

    @Override  //타입 변환하기 alt+insert에서 toString
    public String toString() { //원하는 출력문으로 변경 가능
        return "원[" + radius + ']';  //ctrl + alt + l을 누르면 정렬
    }
}

class Box1 extends Shape {
    private int length;

    public Box1(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    String show() {
        return "빨간 박스";
    }

    @Override
    public String toString() {
        return "박스[" + length + ']';
    }
}