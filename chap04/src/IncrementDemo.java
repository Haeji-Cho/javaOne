public class IncrementDemo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("n-> " + n);
        inc(n);
        System.out.println("n2 -> " + n);
        //다시 보낼 때 더해진 값을 보내는 것이 아니라 복사본만 사용한 것이라 원본인 10을 출력한다.

    }
    static void inc(int n){
        System.out.println("i-> "+ n);
        n++;
        System.out.println("i2-> "+n);
    }
}
