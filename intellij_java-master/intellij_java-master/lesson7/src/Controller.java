public interface Controller { //interface에는 default나 static, private이 없는 메소드는 넣을 수 없다.


    default void repair(){

        show("장비를 수히라다.");
    }

    static void reset(){
        System.out.println("징비를 초기화하다.");
    }

    static void show(String s){
        System.out.println(s);
    }

    void turnOn();
    void turnOff();


}

interface RemoteControllable extends Controller{
    void remoteOn();
    void remoteOff();

}