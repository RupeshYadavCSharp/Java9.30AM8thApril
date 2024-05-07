package pack_Methods;


import java.util.Scanner;

public class Dob {
    public void DateofBirth(){
        Scanner scan=new Scanner (System.in);
        int date,month,year;
        int Today=7,t;
        int Month=5,m;
        int Year=2024,y;
        System.out.println("Enter the Birthday date ");
        date=scan.nextInt();
        System.out.println("Enter the month ");
        month=scan.nextInt();
        System.out.println("Enter the year");
        year=scan.nextInt();
        t=Today-date;
        m=Month-month;
        y=Year-year;
        System.out.println("The todays date of Birth is "+t+m+y);





    }

    public static void main(String[] args) {
        Dob d=new Dob();
        d.DateofBirth();
    }
}
