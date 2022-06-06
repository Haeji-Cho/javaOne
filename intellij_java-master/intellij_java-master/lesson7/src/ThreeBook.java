
import java.util.Arrays;

public class ThreeBook {
    public static void main(String[] args) {

        Book[] books = {new Book(1000), new Book(2000), new Book(3000)};

        System.out.println("정렬 전");
        for(Book b: books)
            b.show();

        Arrays.sort(books);

        System.out.println("정렬 후");
        for(Book b :books)
            b.show();
    }
}


class Book implements Comparable{
    int price;

    public Book(int price) {
        this.price = price;
    }
    void show(){
        System.out.println(price);
    }

    public int compareTo(Object o){
        Book book = (Book) o;

        if(this.price < book.price)
            return -1;
        else if(this.price > book.price)
            return 1;
        else
            return 0;
    }
}