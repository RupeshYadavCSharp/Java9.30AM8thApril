package pack_loop;
import java.lang.*;
import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num,counter=0;
        System.out.println("Enter the Any Digit ");
        num=scan.nextInt();

        while(num !=0){
            num=num/10;
            counter++;


        }
        System.out.println("Its a "+ counter + " Digit No ");

    }
}
