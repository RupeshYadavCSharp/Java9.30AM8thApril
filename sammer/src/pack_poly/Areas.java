package pack_poly;

import java.util.Scanner;

//Method Overloading

public class Areas {
    public void area(double length,double breadth){
        double A,B;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Area length and Breadth ");
        length=scan.nextDouble();
        breadth=scan.nextDouble();
         A=length*breadth;
        System.out.println("The area is "+A);
    }
    public void area(double radius){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the redius ");
        radius=scan.nextDouble();
        double red=3.14*radius*radius;
        System.out.println("The redius of circule is "+red);


    }
    public void area(float base,float height){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Area of triangle Base\n Height  ");
        base=scan.nextFloat();
        height=scan.nextFloat();
        float tri;
        tri=(base*height)/2;
        System.out.println("The area of triangle is"+tri);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int ch;
        System.out.println("1 Enter the area\n 2 redius \n 3 area of traingle ");
        ch=scan.nextInt();
        Areas objare=new Areas();
        switch (ch){
            case 1:
                double l = 0,b=1;
                objare.area(l,b);
                break;
            case 2:
                double r=0;
                objare.area(r);
                break;
            case 3:
                float bas=0,he=1;
                objare.area(bas,he);
            default:
                System.out.println("Incorrect number ");

        }


    }


}
