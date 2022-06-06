public class ArrayListInt {
    public static void main(String[] args) {  //가변인수
        printSum(1, 2, 3);
        printSum(10, 20, 30);
        printSum(32, 53, 6);
    }
    static void printSum(int ...v){
        int sum = 0;
        for(int i : v)
            sum += i;
        System.out.println(sum);
    }
}
