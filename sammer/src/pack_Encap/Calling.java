package pack_Encap;

import java.util.Scanner;

public class Calling {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the raea");
        double a=scan.nextDouble();
        System.out.println("Enter the perimetrt");
        double p=scan.nextDouble();

        Encapsulation obj=new Encapsulation();
        obj.area(a);
        obj.parameter(p);
        obj.ptint();


        obj.parameter(p);




    }


}
