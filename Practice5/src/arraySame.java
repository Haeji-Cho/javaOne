public class arraySame {
    public static void main(String[] args) {
        int[] a = {3, 2, 4, 1, 5};
        int[] b = {3, 2, 4, 1};
        int[] c = {3, 2, 4, 1, 5};
        int[] d = {2, 7, 1, 8, 9};

        for(int i = 0; i < a.length; i++){
            if(a[i] == d[i])
                System.out.println("true");
            else System.out.println("false");
        }
    }
}
