package com.designpattern.factory;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        Shape shape = null;
       /* if (shapeType.equals("CIRCLE")) {
            shape = new Circle();
        }
        if (shapeType.equals("SQUARE")) {
            shape = new Square();
        }
        else if (shapeType.equals("RECTANGLE")) {
            shape = new Rectangle();
        }
        return shape;
    }*/
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}


