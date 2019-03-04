/*
*
* Ques.5 Implement Bridge Design Pattern for Color and Shape such that Shape and Color can be combined together e.g BlueSquare, RedSquare, PinkTriangle etc.
 *
* */

interface Color{
    String getColorType();

}

abstract class Shape {
    String shape;
    Color color;

    public Shape(String type, Color color) {
        this.shape = type;
        this.color = color;
    }
}

class Blue implements Color {

    @Override
    public String getColorType() {
        return "Blue";
    }
}

class Red implements Color {

    @Override
    public String getColorType() {
        return "Red";
    }
}

class Pink implements Color {

    @Override
    public String getColorType() {
        return "Pink";
    }
}

class Square extends Shape {

    String shape;
    public Square(String shape, Color color) {
        super("4 sides", color);
        this.shape=shape;
    }

    @Override
    public String toString() {
        return "Square{ shape='" + super.shape + '\'' +
                ", color=" + color.getColorType() +
                '}';
    }
}

class MyTriangle extends Shape {

    String shape;
    public MyTriangle(String shape, Color color) {
        super("3 sidded", color);
        this.shape=shape;
    }

    @Override
    public String toString() {
        return "MyTriangle{ shape='" + super.shape + '\'' +
                ", color=" + color.getColorType() +
                '}';
    }
}

public class Ques5 {

    public static void main(String args[]) {

        Color blue=new Blue();
        Color red=new Red();
        Color pink=new Pink();

        System.out.println(new MyTriangle("MyTriangle",blue));
        System.out.println(new Square("Square", blue));

        System.out.println(new MyTriangle("MyTriangle",red));
        System.out.println(new Square("Square", red));

        System.out.println(new MyTriangle("MyTriangle",pink));
        System.out.println(new Square("Square", pink));

    }
}
