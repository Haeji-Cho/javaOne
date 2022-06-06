package sec02;

public class ArrayDouble {
    public static void main(String[] args) {
        double[][] interests = {
                {3, 3, 3, 3},
                {2, 2, 2, 2},
                {1, 1, 1, 1}
        };
        double[] sum1 = {0.0, 0.0, 0.0};
        double sum2 = 0.0;

        for(int i = 0; i < interests.length; i++){
            for(int j = 0; j < interests[i].length; j++){
                sum1[i] += interests[i][j];
            }
            System.out.printf(("%d차년도 평균 이자율 = %.2f%%\n"),
                    i + 1, sum1[i]/4);
            sum2 += sum1[i];
        }
        System.out.printf("3년간 평균 이자율 = %.2f%%\n",
                sum2 / (3*4));

    }
}
