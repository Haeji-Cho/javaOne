package workspace.chap10.src.challenge.two;

import java.util.Arrays;
import java.util.List;

public class Shape {
    private String type;
    private String color;
    private Double area;

    public Shape(String type, String color, Double area) {
        this.type = type;
        this.color = color;
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return String.format("%s(%s, %.1f)", type, color, area);
    }

    static List<Shape> shapes = Arrays.asList(
            new Shape("�ﰢ��", "������", 10.5),
            new Shape("�簢��", "�Ķ���", 11.2),
            new Shape("��", "�Ķ���", 16.5),
            new Shape("��", "������", 5.3),
            new Shape("��", "�����", 8.1),
            new Shape("�簢��", "�Ķ���", 20.7),
            new Shape("�ﰢ��", "�Ķ���", 3.4),
            new Shape("�簢��", "������", 12.6)
    );
}
