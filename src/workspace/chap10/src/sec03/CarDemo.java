package workspace.chap10.src.sec03;

import sec02.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CarDemo {
    public static void main(String[] args) {
        List<Car> dieselcars = findCars(Car.cars, c -> !c.isGasoline());
        System.out.println("������ �ڵ��� = " + dieselcars);

        List<Car> oldCars = findCars(Car.cars, c -> c.getAge() > 10);
        System.out.println("������ �ڵ��� = " + oldCars);

        List<Car> oldDieselCars = findCars(Car.cars, c -> c.getAge() > 10 && !c.isGasoline());
        System.out.println("������ ������ �ڵ��� = " + oldDieselCars);

        System.out.print("������ �ڵ��� = ");
        printCars(dieselcars, c -> System.out.printf("%s(%d) ", c.getModel(), c.getAge()));
        System.out.print("\n������ �ڵ��� = ");
        printCars(oldCars, c -> System.out.printf("%s(%d, %d) ", c.getModel(), c.getAge(), c.getMileage()));
    }

    public static List<Car> findCars(List<Car> all, Predicate<Car> p) {
        List<Car> result = new ArrayList<>();

        for (Car car : all) {
            if (p.test(car))
                result.add(car);
        }
        return result;
    }

    public static void printCars(List<Car> all, Consumer<Car> c) {
        for (Car car : all) {
            c.accept(car);
        }
    }
}