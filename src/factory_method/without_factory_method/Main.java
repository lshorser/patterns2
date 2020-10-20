package factory_method.without_factory_method;

import factory_method.without_factory_method.Canvas;

public class Main {
    public static void main(String[] args) {


        Canvas canvas = new Canvas ();
        String [] shapeNames  = {"ROUND SHAPE", "RECTANGLE", "SQUARE","PANTAGON" };

        for (String shapeName : shapeNames)
            canvas.addShape(shapeName);

    }
}