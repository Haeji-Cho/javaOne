package sec02;

import java.util.Calendar;

import static java.util.Arrays.sort;
import static java.util.Calendar.JANUARY;

public class StaticImportDemo {
    public static void main(String[] args){
        int[] data = {3, 5, 1, 7};

        sort(data);
        System.out.println(JANUARY);
        Calendar.getInstance();  //정적 import를 하지 않았을 때
        //static을 하려면 import static java.util.Calendar; 을 넣어줌


    }
}
