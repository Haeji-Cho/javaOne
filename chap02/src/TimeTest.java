public class TimeTest {
    public static void main(String[] args) {
        int t = 3661;
        int s = t % 60;
        int m = (t / 60) % 60; //시간으로 넘어갈 수 있으니 시간, 분으로 두 번 나눈다
        int h = (t / 60) / 60; //분이 아니라 시간을 계산해야니까 두 번 나눈다.
        System.out.println(h + " 시간" + m + "분" + s +"초");
    }
}
