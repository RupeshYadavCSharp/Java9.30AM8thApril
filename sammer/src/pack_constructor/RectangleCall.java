package pack_constructor;

import java.util.Scanner;

public class RectangleCall 
{
    public static void main(String[] args) 
    {
        double length,breadth;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length");
        length = scan.nextDouble();
        System.out.println("Enter the breadth");
        breadth = scan.nextDouble();

        Rectangle objrectangle = new Rectangle(length,breadth);
        double a = objrectangle.getArea();
        System.out.println("Area is " +a);
        double p = objrectangle.getPeri();
        System.out.println("Perimeter is " +p);

    }
}
