public class PhoneTest {
    public static void main(String[] args) {
        Phone[]phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그")};
        for(Phone phone: phones){
            if(phone instanceof Smartphone){
                ((Smartphone)phone).playGame();
            }
            else if(phone instanceof Telephone){
                ((Telephone)phone).autoAnswering();
            }
            else if(phone instanceof Phone){
                phone.talk();
            }
        }
    }
}

class Phone {
    protected String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    void talk(){
        System.out.printf("%s가 통화 중이다.", owner);
        System.out.println(" ");
    }
}

class Telephone extends Phone{
    private String when;

    public Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }

    void autoAnswering(){
        System.out.printf("%s가 없다. %s 전화 줄래", owner, when);
        System.out.println(" ");
    }
}

class Smartphone extends Telephone{
    private String game;

    public Smartphone(String owner,  String game) {
        super(owner, "when");
        this.game = game;
    }

    void playGame(){
        System.out.printf("%s가 %s 게임을 하는 중이다.", owner, game);
        System.out.println(" ");
    }
}