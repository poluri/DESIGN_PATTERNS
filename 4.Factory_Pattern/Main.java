import Shape.ShapeInterface;

public class Main {

    public static void main(String args[]){

        ShapeFactory factory = new ShapeFactory();

        ShapeInterface obj = factory.getShape("RECTANGLE");

        obj.draw();
    }
}
