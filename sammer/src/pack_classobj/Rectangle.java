package pack_classobj;

import java.util.Scanner;

public class Rectangle {
    private int length;
    private int bradth;
    int total;
    int per;

    public void read(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the lenght & bradth  ");
        length=scan.nextInt();
        bradth=scan.nextInt();

    }
    public void area(){
        int total;
        total=length*bradth;
        System.out.println("The area is "+total);

    }

    public void perimeter(){
        int per;

        per=2*(length+bradth);
        System.out.println("The perimeter is "+per);

    }


}
