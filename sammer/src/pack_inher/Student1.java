package pack_inher;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Student1 extends Dcp {
    private int rollNo;
    private int Per;
    public void  readStd(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the RollNo ");
        rollNo=scan.nextInt();
        System.out.println("Enter the Percentages ");
        Per=scan.nextInt();



    }
    public  void ShowStd(){
        System.out.println("The Roll No is "+rollNo);
        System.out.println("The Percentages is "+Per);
    }
}
