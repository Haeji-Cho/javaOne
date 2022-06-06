public class Exam1Car {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

		// Car 클래스의 2개 메서드를 이용하여 출력하는 코드
        System.out.printf("자동차 수 : %d\n",  Car.getNOfCars);
        System.out.printf("빨간 자동차 수 : %d",Car.getNOfRedCars);
    }
}

class Car {
    // 필요한 변수 선언문 및 생성자
    String n;
    static int getNOfCars;
    static int getNOfRedCars;

    public Car(String n) {
        this.n = n;
        getNOfCars++;
        if(n == "RED" || n == "red") getNOfRedCars++;
    }

    public void getNOfCars(String n) {
		// 코드 추가
        getNOfCars++;
    }

    public void getNOfRedCars() {
		// 코드 추가
        if(n == "RED"|| n == "red"){getNOfRedCars++;}

    }
}
