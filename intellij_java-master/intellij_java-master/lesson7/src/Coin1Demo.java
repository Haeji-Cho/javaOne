public class Coin1Demo implements Coin{
    public static void main(String[] args) {
        System.out.println(Coin.Dime);
    }
}

interface Coin {
    int Penny = 1, Nickel = 5, Dime = 10, Quarter = 25;

}