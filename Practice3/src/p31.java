public class p31 {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.paper = 100;
        p1.pp = 70;
        p1.print(0);
    }
}
class Printer{
    int numOfPaper = 0;
    int paper;
    int pp;

    public void print(int amount){
        amount = paper - pp;
        System.out.println(paper + "종이" + pp +"남음"+ amount);
    }
}
