package pack_Abst;

public class Rectangle extends Shape
{
    public Rectangle(double l,double b)
    {
        length = l;
        breadth = b;
    }
    @Override
    public void area() {
        System.out.println("area is " + (length * breadth));
    }

    @Override
    public void perimeter() {
        System.out.println("peri is " + 2 * (length + breadth));
    }
}