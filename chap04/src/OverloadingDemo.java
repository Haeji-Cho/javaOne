public class OverloadingDemo {
    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(2.0, 1));
        System.out.println(max(2, 5, 3));
    }

    static int max(int i, int j){
        return i > j ? i: j;
    }
    static int max(int i, double d) {
        return i > d ? i : (int) d;
    }
    static double max(double d, int i) {
        return i > d ? i : d;
    }
    static int max(int i, int j, int k){
        return max(max(i, j), k);
    }


}
