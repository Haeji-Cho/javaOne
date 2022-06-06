public class LocalVariableDemo {
    public static void main(String[] args) {
        int a = 0;
        double b;

        //System.out.println(b); //b를 선언하지 않으면 오류가 난다.

        int c = 0;

        //public double d = 0.0; //public은 두 번 선언할 수 없다.

    }
    static int n; //지역변수가 아니므로 어느 곳에서나 정의하고 사용할 수 있다.
}
