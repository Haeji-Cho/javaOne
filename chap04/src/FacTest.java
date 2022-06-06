public class FacTest {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }

    //fact() 메서드 구현
    static int fact(int x){
        return switch (x){
            case 0, 1 -> 1;
            case 2 -> 2;
            default -> x * fact(x-1);
        };
    }

    /*static int mul(int y){
        for(int i = y; i > 1; i-- )
            i *= i;
    }*/
}
