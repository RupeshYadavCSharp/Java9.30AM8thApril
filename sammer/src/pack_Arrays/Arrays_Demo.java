package pack_Arrays;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Arrays_Demo {
    public static void main(String[] args) {

        int ja[][][] = new int[3][][];
        ja[0] = new int[3][3];//first is row [3] and secound is coloumn [3]
        ja[1] = new int[3][2];
        ja[2] = new int[4][2];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size ");


        for (int i = 0; i < ja.length; i++)
        {
            for (int j = 0; j < ja[i].length; j++)
            {
                for (int k = 0; k < ja[i][j].length; k++)
                {
                    ja[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("Array is ");

        for (int i = 0; i < ja.length; i++)
        {
            for (int j = 0; j < ja[i].length; j++)
            {
                for (int k = 0; k < ja[i][j].length; k++)
                {
                    System.out.print(ja[i][j][k] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
