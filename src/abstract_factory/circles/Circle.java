package abstract_factory.circles;

import abstract_factory.shape_factories.Shape;


public class Circle implements Shape {


    protected int radius;

    public Circle(int r) {
        radius = r;
    }

    @Override
    public void draw()
    {

    }

}
