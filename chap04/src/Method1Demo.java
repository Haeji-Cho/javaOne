public class Method1Demo {
    public static void main(String[] args) {
        System.out.println(sum(1, 10));
        System.out.println(sum(10, 100));
    }
    static int sum(int x, int y) {
        int total = 0;
        for(int i = x; i <= y; i++)
            total += i;
        return total;
    }
}
