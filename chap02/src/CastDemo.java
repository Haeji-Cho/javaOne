public class CastDemo {
    public static void main(String[] args) {
        int i;
        double d;
        byte b;

        i = 7/4;
        System.out.println(i);
        d = 7/4;
        System.out.println(d);
        d = 7 / (double)4;
        System.out.println(d);
//        i = 7 / (double) 4;  큰 것을 작은 그릇에 담으니 오류 발생
        i = 300;
        if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
            System.out.println("오류");
        else
            b = (byte) i;

    }
}
