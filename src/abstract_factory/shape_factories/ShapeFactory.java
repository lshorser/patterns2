package abstract_factory.shape_factories;

public interface ShapeFactory {

    public Shape getShape(ShapeType type);

}