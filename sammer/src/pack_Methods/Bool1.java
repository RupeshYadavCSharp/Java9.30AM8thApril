package pack_Methods;

import java.util.Scanner;

public class Bool1 {
    public boolean isEvent(int num){
        if(num%2==0){
            System.out.println("The no is Even ");
            return true;
        }

        System.out.println("The No is false ");
        return false ;
    }

    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the No ");
        num=scan.nextInt();
        Bool1 add=new Bool1();
        boolean b=add.isEvent(num);
        System.out.println(b);


    }
}
