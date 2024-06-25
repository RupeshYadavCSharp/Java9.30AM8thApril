package pack_Method;

import java.util.Scanner;

public class ElectricBill {
   public void billAmount(){
        try {
            float bill,amo;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the Bill Unit ");
            bill=scan.nextFloat();

            if(bill<=100){
                amo=bill*2;
                System.out.println("Your Bill amount is "+amo);

            } else if (bill>200 && bill<300) {



                
            }
        }
        catch (Exception e){

        }

    }

}
