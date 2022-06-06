public class DiceTest {
    public static void main(String[] args) {
        Dice d = new Dice(5);
        d.num();
        System.out.println(d.num());
    }
}

class Dice{
    private int face = (int)(Math.random()*6)+1;

    public int num(){
        return face;
    }

    public Dice(int face) {
        this.face = face;
    }

}