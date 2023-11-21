public class Circle extends Shape
{
    private float _radius;
    public Circle(float radius)
    {
        _radius = radius;
    }

    @Override
    public float CalculateArea() {
        float pi = 3.14f;
        return pi * (_radius * _radius);
    }
}
