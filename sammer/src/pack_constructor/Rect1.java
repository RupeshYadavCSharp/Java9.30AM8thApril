package pack_constructor;

import java.util.Scanner;

public class Rect1 {
    private int l,b;
    public Rect1(int lenght,int breath){
        l=lenght;
        b=breath;

    }
    public int Area(){
        int area=l*b;
        return area;
    }
    public int peri(){
        int perimeter=(l*b)*2;
        return perimeter;
    }

    //constructor calling

    public static void main(String[] args) {
        int leghth,braeth;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length");
        leghth=scan.nextInt();
        System.out.println("Enter the breath");
        braeth= scan.nextInt();

        Rect1 objrect=new Rect1(leghth,braeth);

        int a=objrect.Area();
        System.out.println("The area is "+a);
        int b=objrect.peri();
        System.out.println("The perimeter is "+b);

    }

}
