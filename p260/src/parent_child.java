public class parent_child {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.name);
        p.print();
    }

}

class Parent{
    String name = "영조";

    void print(){
        System.out.printf("나는 %s", name);;
    }
}

class Child extends Parent{
    String name = "사도세자";


    void print(){
        System.out.printf("나는 %s", name);;
    }
}
