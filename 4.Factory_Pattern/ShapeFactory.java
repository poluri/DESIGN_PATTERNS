import Shape.Circle;
import Shape.Rectangle;
import Shape.ShapeInterface;
import Shape.Square;

public class ShapeFactory {

    public ShapeInterface getShape(String shape){

        switch (shape){
            case "CIRCLE":
                 return new Circle();
            case "SQUARE":
                 return new Square();
            default:
                return new Rectangle();
        }

    }
}
