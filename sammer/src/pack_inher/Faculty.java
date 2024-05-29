package pack_inher;

import java.util.Scanner;

public class Faculty extends Dcp {
    private String exp;
    private float sal;
    public void readFac(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the experiance ");
        exp=scan.nextLine();
        System.out.println("Enter the sal ");
        sal=scan.nextFloat();
    }
    public void ShowFac(){
        System.out.println("My experiance is "+exp);
        System.out.println("My salery is "+sal);
    }
}
