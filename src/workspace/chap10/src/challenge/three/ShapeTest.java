package workspace.chap10.src.challenge.three;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ShapeTest {
    public static void main(String[] args) {
        List<Shape> rectagles = findShapes(Shape.shapes, s -> s.getType().equals("�簢��"));
        System.out.print("�簢�� = ");
        System.out.println(rectagles);
        List<Shape> redNSmallShapes = findShapes(Shape.shapes, s -> s.getColor().equals("������") && s.getArea() <= 12.0);
        System.out.print("���� ����(����<=12.0) : ");
        System.out.println(redNSmallShapes);
    }

    static List<Shape> findShapes(List<Shape> animals, Predicate<Shape> p) {
        List<Shape> result = new ArrayList<>();

        for (Shape a : animals)
            if (p.test(a))
                result.add(a);
        return result;
    }
}
