import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrinterTest {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(70);
    }
}
class Printer{
    int numOfPapers = 0;

    public void print(int amount){
        numOfPapers = 100;
        System.out.println(numOfPapers - amount);
    }
}