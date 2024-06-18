package pack_Abst;

public class Circle extends Shape
{
    public Circle(double r)
    {
        radius = r;
    }

    @Override
    public void area() {
        System.out.println("Area is " + (3.14 * radius *radius));
    }

    @Override
    public void perimeter()
    {
        System.out.println("peri is " + (2 * 3.14 * radius));
    }
}