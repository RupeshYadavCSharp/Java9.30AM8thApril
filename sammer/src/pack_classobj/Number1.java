package pack_classobj;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Number objnumber=new Number();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        objnumber.setnum(n1,n2,n3);
        int x =objnumber.getGreater();
        int y=objnumber.getSmall();
        System.out.println("The largest no is "+x);
        System.out.println("The smallest no is "+y);

    }
}
