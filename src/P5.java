import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        int i, j, k = 0;
        for (i  = 1; i < 20; i++){
            for(j = 1; j < 20; j++){
                for(k = 1; k < 20; k ++){
                    if(i < j && (i*i)+(j*j) == (k*k)){
                        System.out.println("a: " + i + " b: " + j + " c: " +k);
                    }
                }
            }
        }


    }
}
