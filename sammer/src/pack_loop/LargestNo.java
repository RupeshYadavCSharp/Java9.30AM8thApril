package pack_loop;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num,rem,largest=0;
        System.out.println("Enter the no ");
        num=scan.nextInt();
        while(num !=0){
            rem=num%10;
            if(largest<rem){
                largest=rem;
            }
            num=num/10;


        }
        System.out.println("The largest No is "+largest);
    }
}
