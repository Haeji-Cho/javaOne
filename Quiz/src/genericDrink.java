public class genericDrink{//현 풀이는 generic type이다.
    public static void main(String[] args) {

        Drinkg<Cokeg> dc = new Drinkg<>(new Cokeg()); //선언된 항목을 넣어주기
        Drinkg<Juiceg> dj = new Drinkg<>(new Juiceg());
        //       Drink<Pesticide> dp = new Drink<>(new Pesticide()); //자식 타입이 아니므로 오류가 발생한다.

//
//        Drink d1 = new Drink(new Coke());
//        Drink d2 = new Drink(new Juice());
//        //       Drink d3 = new Drink(new Pesticide()); //오류가 발생한다.
//
//        d1.drink();
//        d2.drink();

        dc.drinkg();
        dj.drinkg();
        //     dp.drink(); //자식 타입이 아니므로 오류 발생
    }
}

//sealed interface Drinkable permits  Coke, Juice{}
//sealed interface Drinkable permits  Coke, Juice{
//    String name();
//}

interface Drinkableg{}
final class Juiceg implements Drinkableg{
    public String name(){
        return "쥬스";
    }
}

class Cokeg implements Drinkableg { //sealed가 오면 permits가 와야 한다.
    public String name(){
        return "콜라";
    }
}

//sealed class CC extends Coke permits DC, UC {}
//final class DC extends CC{}
//final class UC extends CC{}
//
////non-sealed class PC extends Coke {}
//
//class PC1 extends PC{} //non-sealed로 만드어서 아무거나 만들어도 된다. sealed는 자식 클래스를 제한한다. final은 끝나서 자식이 없다.
//class PC2 extends PC{}

class Pesticideg{
    String name(){
        return "농약";
    }
}

class Drinkg<T extends Drinkableg> { //extends Drinkable을 넣어줘서 Drinakable의 자식 타입만 들어오도록 한다.
    T t;

    public Drinkg(T t) {
        this.t = t;
    }

    void drinkg(){
        if(t instanceof Cokeg c)
            System.out.println(c.name()+ "를 마신다.");
        else if(t instanceof Juiceg j)
            System.out.println(j.name()+ "를 마신다.");
        else if(t instanceof Pesticideg p)
            System.out.println(p.name()+ "를 마신다.");
    }
}


//class Drink{
//    Drinkable d;
//
//    public Drink(Drinkable d) {
//        this.d = d;
//    }
//
//    void drink(){
//        System.out.println(d.name() +"를 마신다.");
//    }
//}
