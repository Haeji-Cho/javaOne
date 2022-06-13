import java.awt.print.Book;
import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        Book1[] books = {
                new Book1(15000),
                new Book1(50000),
                new Book1(20000)
        };
        System.out.println("정렬 전");
        for(Book1 b: books){
            System.out.println(b);
        }

        System.out.println("정렬 후");
        Arrays.sort(books);
        for(Book1 b: books){
            System.out.println(b);
        }

    }
}

record Book1(int price) implements Comparable<Book1>{
    @Override
    public int compareTo(Book1 b) {
        return price - b.price;
    }
}

//
//class Book implements Comparable<Book>{
//    int price;
//
//    public Book(int price) {
//        this.price = price;
//    }
//
//
//    @Override
//    public int compareTo(Book o) {
//        Book b = (Book)o;
//
//        //return this.price < b.price ? -1: (price == b.price);
//        return this.price - b.price;
//    }
//
//    @Override
//    public String toString() {
//        return "Book[" +
//                "price=" + price +
//                ']';
//    }
//}