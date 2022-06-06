public class BallDemo {
    public static void main(String[] args) {
        //Ball ball = new Ball(); 생성자를 class에서 만들면 여기서 오류가 발생
        Ball ball = new Ball(3.0, "빨강");
        ball.show();

        Ball ball1 = new Ball(3);
        ball.show();
    }
}

class Ball{
    private double radius;
    private String color;

//    public Ball(){} 이 문장이 없어도 위에서 컴파일러가 자동으로 만들어서 출력해줌

    /*public Ball(double r){
        radius = r;
    }*/

    public Ball(String c){
        color = c;
    }

    public Ball(double r, String c){
        radius = 1.0;
        color = "검정";

    }

    public Ball(double radius){
        this.radius = radius;
    }

    public Ball(){
        this(1.0); //자기 자신은 가장 첫 줄에 나와야 한다.
    }

    void show(){
        System.out.println("반지름이 " + radius + ", " + "색은 " + color);
    }
}
