package pack_loop;

import java.util.Scanner;
//Addtion of enter digit

public class Loop2 {
    public static void main(String[] args) {
        Scanner sacn=new Scanner(System.in);
        int num,sum1=0,sum;
        System.out.println("Enter the any Number ");
        num=sacn.nextInt();

        while (num !=0){
            sum=num%10;

            num=num/10;
            sum1=sum1+sum;



        }
        System.out.println("The addtion of No is "+ sum1);
    }
}


