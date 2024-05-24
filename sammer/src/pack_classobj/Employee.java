package pack_classobj;



import java.util.Scanner;

public class Employee
{
    private float sal;
    private float tax;

    public void readSal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the salary of Employee:");
        sal = scan.nextFloat();

    }

    public void showtax() {
        if ((sal >= 1) && (sal <= 150000))
        {
            System.out.println("0% TAX is applied on your salary");
        }
        else if ((sal >= 150001) && (sal <= 300000))
        {
            tax = (sal * 10) / 100;
            System.out.println(" 10% tax is applied on your salary which is " + tax+" Rs/-");
        }
        else if ((sal >= 300001) && (sal <= 500000))
        {
            tax = (sal * 20) / 100;
            System.out.println("20% tax is applied on your salary which is " + tax+" Rs/-");
        } else
        {
            tax = (sal * 100) / 30;
            System.out.println("30% tax is applied on your salary which is " + tax+" Rs/-");

        }

    }
}
