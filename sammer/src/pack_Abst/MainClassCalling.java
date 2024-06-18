package pack_Abst;

public abstract class MainClassCalling
{
    public static void main(String[] args) {

        Circle c = new Circle(1.3);
        c.area();
        c.perimeter();

        Rectangle r = new Rectangle(2.3,5.6);
        r.area();
        r.perimeter();



    }
}
