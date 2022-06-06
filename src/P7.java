public class P7 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        return switch (n){
          case 0, 1-> 1;
          case 2 -> 2;
            default -> n * fact(n-1);
        };
    }
}
