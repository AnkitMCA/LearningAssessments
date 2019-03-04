/*
*
* Ques.2 Implement Factory Pattern to get the Polygon of differnt type.
 *
* */

interface PolygonArea{
    void area();
}

class Triangle implements PolygonArea{
    @Override
    public void area() {
        System.out.println("Area of Triangle is calculated...");
    }
}

class Pentagon implements PolygonArea{
    @Override
    public void area() {
        System.out.println("Area of Pentagon is calculated...");
    }
}

class Hexagon implements PolygonArea{
    @Override
    public void area() {
        System.out.println("Area of Hexagon is calculated...");
    }
}

class Polygon{
    PolygonArea polygonArea;

    public PolygonArea getPolygonArea() {
        return polygonArea;
    }

    public void setPolygonArea(PolygonArea polygonArea) {
        this.polygonArea = polygonArea;
    }
}

class PolygonFactory{
    static Polygon getPolygonObject(String nameOfPolygon){
        Polygon polygon=new Polygon();

        switch (nameOfPolygon){
            case "Triangle" :
                polygon.setPolygonArea(new Triangle());
                break;
            case "Hexagon" :
                polygon.setPolygonArea(new Hexagon());
                break;
            case "Pentagon" :
                polygon.setPolygonArea(new Pentagon());
                break;
        }
        return polygon;
    }
}

public class Ques2 {
    public static void main(String args[]) {

        Polygon polygon=PolygonFactory.getPolygonObject("Triangle");
        polygon.getPolygonArea().area();

        Polygon polygon1=PolygonFactory.getPolygonObject("Pentagon");
        polygon1.getPolygonArea().area();

        Polygon polygon2=PolygonFactory.getPolygonObject("Hexagon");
        polygon2.getPolygonArea().area();

    }
}
