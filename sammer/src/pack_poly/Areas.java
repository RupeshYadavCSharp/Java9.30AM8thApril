package pack_poly;

import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.A;

public class Areas {
    public void area(double lenghth, double breadth){
        double A;
        Scanner scan=new Scanner(System.in);

        A=scan.nextDouble();
        A=lenghth*breadth;
        System.out.println("The area is"+A);
    }
    public void area(double redius){
        double red;
        Scanner scan=new Scanner(System.in);

        red=scan.nextDouble();
        red=3.14*redius*redius;
        System.out.println("The redius  is"+red);



    }
    public void area(float base, float height){
        float tri;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the area of Triangle ");
        tri=scan.nextFloat();
        tri=(base*height)/2;
        System.out.println("The area of traingle is "+tri);


    }

    public static void main(String[] args) {
        int ch;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the area");
        System.out.println("Enter the redius ");
        System.out.println("Enter the area of triangle ");
        ch=scan.nextInt();
        Areas obj=new Areas();


        switch (ch){
            case 1:
                obj.area();
                System.out.println("The area is "+A);


        }



    }
}
