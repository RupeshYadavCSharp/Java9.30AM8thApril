package pack_inher;

import pack_classobj.Public;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Dcp extends Student1 {
    private int rollNo;
    private String DepName;

    public void  readdcp(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Dcp No");
        rollNo=scan.nextInt();
        System.out.println("Enter the Percentage");
        DepName=scan.nextLine();
    }
    public void  Showdcp(){
        System.out.println("The Dcp no is "+rollNo);
        System.out.println("The Percentage  is "+DepName);
    }
}
