package pack_Methods;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Dob {
    public  static  void DateofBirth(){
        Scanner scan=new Scanner (System.in);
        int Days,month,year;
        int Today=7,t;
        int Month=5,m;
        int Year=2024,y;
        System.out.println("Enter the date  ");
        Days=scan.nextInt();
        System.out.println("Enter the month ");
        month=scan.nextInt();
        System.out.println("Enter the year");
        year=scan.nextInt();

        LocalDate Dob=LocalDate.of(year,month,Days);
        LocalDate curr=LocalDate.now();

        Period p=Period.between(Dob,curr);
        System.out.println("Years "+p.getYears());
        System.out.println("month "+p.getMonths());
        System.out.println("day "+p.getDays());





    }

    public static void main(String[] args) {

        DateofBirth();
    }
}
