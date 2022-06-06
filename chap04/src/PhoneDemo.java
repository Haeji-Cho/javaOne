public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.model = "갤럭시 노트 20";
        phone1.value = 100;
        phone1.print();

        Phone phone2 = new Phone();
        phone1.model = "갤럭시 노트 10";
        phone1.value = 80;
        phone1.print();
    }
}

class Phone {
    String model;
    int value;

    void print() {
        System.out.println(this.value + "만 원짜리 " + model +" 스마트폰"); //this가 있어도 없어도 상관없다
    }
}