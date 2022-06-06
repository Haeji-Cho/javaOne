package sec4;

public class two {
    void print(){
        One one = new One();  //배우자는 객체를 생성해줘야 물려받을 수 있다. 자식이 아니기땨문에
        System.out.println();
        System.out.println(one.roommate);
        System.out.println(one.child);
        System.out.println(one.anybody);
    }
}
