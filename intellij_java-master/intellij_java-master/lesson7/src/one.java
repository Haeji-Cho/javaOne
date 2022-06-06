public class one{
    public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show();
    }
}

abstract class Abstract{
    int i;

    abstract void show();
}

class Concrete extends Abstract{
    int j;

    public Concrete(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show(){
        System.out.printf("i = %d, j = %d", i, j);
    }
}