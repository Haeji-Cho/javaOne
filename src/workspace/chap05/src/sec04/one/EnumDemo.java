package workspace.chap05.src.sec04.one;

public class EnumDemo {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE; //female은 gender 타입이다.

        if (gender == Gender.MALE) //male도 gender 타입이다.
            System.out.println(Gender.MALE + "은 병역 의무가 있다.");
        else
            System.out.println(Gender.FEMALE + "은 병역 의무가 없다.");

//        if (gender == Direction.SOUTH)  //gender와 direction은 타입 자체가 다르다.
//            System.out.println(Direction.SOUTH + "는 누구?");
//        gender = 5;
    }
}

enum Gender { MALE, FEMALE ;


enum Direction { EAST, WEST, SOUTH, NORTH }