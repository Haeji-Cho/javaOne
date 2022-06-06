public class car {
    public static void main(String[] args) {
        Carnum c1 = new Carnum("red");
        Carnum c2 = new Carnum("blue");
        Carnum c3 = new Carnum("Red");

        System.out.printf("자동차 수: %d 빨간색 자동차 수 : %d", Carnum.getNumOfCar, Carnum.getNumOfRedCar);
    }
}
class Carnum{
    String n;
    static int getNumOfCar = 0;
    static int getNumOfRedCar = 0;


    public Carnum(String n) {
        this.n = n;
        getNumOfCar++;
        if(n == "Red") getNumOfRedCar++;
    }
}


