public class Quiz3Line {
    public static void main(String[] args) {
        Line a = new Line("a", 1);
        Line b = new Line("b", 1);
        Line c = new Line("c", 4);    // 라인의 길이는 4
        Box d = new Box("d", 2, 5);   // 박스의 크기는 2 * 5
        Box e = new Box("e", 1, 3);

        System.out.println("라인 a는 라인 b와 길이가 같다? " + a.isSameLine(b));
        System.out.println("라인 a는 라인 b와 동일한 객체이다? " + (a == b));

        System.out.println("박스 d와 박스 e중에 누가 더 큰가? " + b.whosBigger);

        System.out.println("생성한 라인의 개수는 " + Line.getNumOfLines() + "개이다.");
    }
}

class Line {
    private String name;
    private int width;
    private static int numOfLines = 0;

    // 생성자

    public Line(String name, int width) {
        this.name = name;
        this.width = width;
    }

    // getter 메서드

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public static int getNumOfLines() {
        return numOfLines;
    }


    // isSameLine() 메서드
    public void isSameLine(String name, int width) {
        if (width instanceof Line.width) {
            width == Line.wid


        if (width.isSameLine(width)) {
            return true;
        }
        return false;
    }
}

}

class Box extends Line {
    private int height;

    // 생성자

    public Box(String name, int width, int height) {
        super(name, width);
        this.height = height;
    }


    // getter 메서드

    public int getHeight() {
        return height;
    }

    public Box(String name, int width) {
        super(name, width);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }
    // whosBigger() 메서드
    public void whosBigger(String name, int width, int height){
        int big;
        big = width * height;
        if(big > Box.big)
        {
            return name;
        }
    }
}

