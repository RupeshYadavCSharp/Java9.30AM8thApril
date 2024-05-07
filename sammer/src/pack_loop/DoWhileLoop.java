package pack_loop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int i=1;
        do{
            System.out.println(i);
        }while(i>=10);
        System.out.println("Out of loop ");
    }
}
