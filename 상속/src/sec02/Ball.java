package sec02;

public class Ball extends Circle{
    private String color;

    public Ball(String color) {
        this.color = color;
    }

    @Override
    public void findArea() { //부모에서 상속받은 내용을 수정할 수 있다.
        System.out.println("넓이는  4* 3.14*10*10");
    }

    public void findColor() {
        System.out.println(color + "공이다");
    }

    public void findVolume(){
        super.findArea(); //이렇게 하면 위에서 변경한 부모클래스를 다시 부모클래스 내용으로 가져올 수 있다. super
        System.out.println("부피는 4/3 * 3.14 *10 *10 *10");
    }
}
