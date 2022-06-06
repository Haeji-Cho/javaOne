package sec6;

public class FinaleClassDemo {
    public static void main(String[] args) {
        new Good();
        new Better();
    }
}

class Good{

}

final class Better extends Good{

}

//class Best extends Better  -final은 자식 클래스를 만들 수 없다.