public class AnimalDemo {
    public static void main(String[] args) {
        makeSound(new Dog());
        makeSound(new Cuckoo());
    }

    static void makeSound(Animal a){ //Animal이 부모로 dog, cuckoo를 포함하므로 다형성을 사용할 수 있다.
        a.speak();

    }
}

interface Animal{
    void speak();

}

class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("멍멍");
    }
}

class Cuckoo implements Animal{
    @Override
    public void speak() {
        System.out.println("뻐꾹");
    }
}