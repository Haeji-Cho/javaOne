public class Exam1Array {
    //while문 전후에 실행문 추가X
    //max = 7.0
    //max = 8.0
    public static void main(String[] args) {
        double[] myList = { 1.0, 7.0, 6.0, 4.0 };
        Array arr = new Array(myList);
        arr.show();

        double[] yourList = { 3.0, 5.0, 4.0, 6.0, 8.0 };
        arr = new Array(yourList);
        arr.show();
    }
}

// 임의의 double 타입 배열의 원소 중에서 최댓값을 출력
class Array {
    // 필요한 변수 선언문 및 생성자
    double array[] = {};

    public Array(double[] array) {
        this.array = array;
    }

    void show() {
        int i = 1;
        double max = array[0];
		
        while (true) {
			
            // max를 구하는 코드
            max = max > array[i] ? max : array[i];
            if (i > array.length -1 )
                i++;
            else break;
        }
		
        System.out.println("max = " + max);
    }
}
