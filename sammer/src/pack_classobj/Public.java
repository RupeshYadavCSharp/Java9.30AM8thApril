package pack_classobj;

import java.util.Scanner;

public class Public {
   private int age;
   private String name ;

   public void read(){
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the age ");
       age=scan.nextInt();
       System.out.println("Enter the name ");
       name=scan.next();



   }
   public void show(){
       System.out.println("The age is "+age);
       System.out.println("Name is "+name);
   }

    public static void main(String[] args) {
        Public objpublic=new Public();
        objpublic.read();
        objpublic.show();
    }
}
