package creational.prototype.shapes;

import java.util.Objects;

public class ShapePrototypeDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("Circle");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("Rectangle");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("Square");
        System.out.println("Shape : " + clonedShape3.getType());

        Shape clonedShape4 = (Shape) ShapeCache.getShape("Circle");
        System.out.println("Shape : " + clonedShape4.getType());

        if(clonedShape.equals(clonedShape4) || clonedShape == clonedShape4 || Objects.deepEquals(clonedShape, clonedShape4)){
            System.out.println("Same Circle");
        }

        System.out.println("clonedShape - "+clonedShape.hashCode());
        System.out.println("clonedShape4 - "+clonedShape4.hashCode());
        System.out.println("Different Circles !");


    }
}
