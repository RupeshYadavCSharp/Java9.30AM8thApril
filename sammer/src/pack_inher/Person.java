package pack_inher;

import java.util.Scanner;

public class Person {
    private int age;
    private String name;

    public void readPer(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age ");
        age=scan.nextInt();
        System.out.println("Enter the Name ");
        name=scan.next();



    }
    public  void  ShowPer(){
        System.out.println("The age is "+age);
        System.out.println("The name is "+name);

    }


}
