package sec4;

public class One1 extends One{
    //부모의 private을 빼고 물려받음
    void print(){
        System.out.println();
        System.out.println(roommate);
        System.out.println(anybody);
        System.out.println(child);
    }
    public void show(){}  //부모가 public이니까 붇어야함 부모보다 더 작아지면 안된다.
}
