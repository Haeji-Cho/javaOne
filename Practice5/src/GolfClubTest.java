public class GolfClubTest {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}

class GolfClub{
    private String n;
    private int m;

    public GolfClub(int m){
        m = 7;
    }
    public GolfClub(String n) {
        this.n = n;
    }

    public GolfClub(){
        this.m = m;
    }

    void print(){
        System.out.println(m + "번 아이언입니다.");
        System.out.println(n + "입니다.");
    }
}
