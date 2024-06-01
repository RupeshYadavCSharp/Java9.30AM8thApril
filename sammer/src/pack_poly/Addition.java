package pack_poly;

import pack_inher.A;

import java.util.Scanner;

public class Addition {
    public void add(int x,int y){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the X \n Y ");
        x=scan.nextInt();
        y=scan.nextInt();
        int z=x+y;
        System.out.println("The addtion of integer  number is "+z);

    }
    public void add(float x,float y){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the x \n y");
        x=scan.nextFloat();
        y=scan.nextFloat();
        float z=x+y;
        System.out.println("The addtion of flaot no is " +z);
    }
    public void add(long x,long y){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the x \n y");
        x=scan.nextLong();
        y=scan.nextLong();
        long z=x+y;
        System.out.println("The addtion of Long no is " +z);

    }
    public void add(double x,double y){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the x \n y");
        x=scan.nextDouble();
        y=scan.nextDouble();
        double z=x+y;
        System.out.println("The addtion of Double no is " +z);

    }
    public void add(String x,String y){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Firstname \n Lastname");
        x=scan.next();
        y=scan.next();
        String z=x+y;
        System.out.println("The addtion String your name is  " +z);
    }


//calling functions
public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int ch;
    System.out.println("Enter the 1 Integer add \n 2 Flaot addtion \n 3 Long addtion \n 4 Double addtion \n 5 String addtion");
    ch=scan.nextInt();

    Addition objadd=new Addition();

    if(ch==1){
        int x=0,y=1;
        objadd.add(x,y);
    } else if (ch==2) {
        float x=0,y=1;
        objadd.add(x,y);


    }
    else if(ch==3){
        long x=0,y=1;
        objadd.add(x,y);
    } else if (ch==4) {
        double x=0,y=1;
        objadd.add(x,y);

    } else if (ch==5) {
        String x="",y="";
        objadd.add(x,y);

    }

}

}
