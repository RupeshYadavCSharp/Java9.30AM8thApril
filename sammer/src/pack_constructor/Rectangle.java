package pack_constructor;

public class Rectangle {
    private double l,b;
    public Rectangle(double length, double breadth)
    {
        l = length;
        b = breadth;
    }
    public double getArea()
    {
        double area = l * b;
        return area;
    }
    public double getPeri()
    {
        double perimeter = (l+b) * 2;
        return  perimeter;
    }

}
