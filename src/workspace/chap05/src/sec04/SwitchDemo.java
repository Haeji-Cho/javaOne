package workspace.chap05.src.sec04;

public class SwitchDemo {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;

        String s = switch(gender) {
            case MALE -> "은 병역 의무가 있다.";
            case FEMALE -> "은 병역 의무가 없다.";
        };
        System.out.println(gender + s);
    }
}

enum Gender {
    FEMALE,MALE
}