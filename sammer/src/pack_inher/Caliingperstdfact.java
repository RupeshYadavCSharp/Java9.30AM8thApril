package pack_inher;

import java.util.Scanner;

public class Caliingperstdfact
{
    public static void main(String[] args) {
        int ch;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the your choice \n 1.Person \n 2 Faculty ");
        ch=scan.nextInt();


        switch (ch) {
            case 1:
                Student1 objstd=new Student1();
                objstd.readStd();
                objstd.ShowStd();
                objstd.readdcp();
                objstd.Showdcp();
                objstd.readPer();
                objstd.ShowPer();

                break;

            case 2:

                Faculty objfac=new Faculty();
                objfac.readFac();
                objfac.ShowFac();
                objfac.readdcp();
                objfac.Showdcp();
                objfac.readPer();
                objfac.ShowPer();
                break;
            default:
                System.out.println("Invalid Choice");



        }






    }
}
