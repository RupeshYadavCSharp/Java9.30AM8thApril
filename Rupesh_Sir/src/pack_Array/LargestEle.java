package pack_Array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestEle
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements ");
        int size = scan.nextInt();
        int []arr = new int[size];

        System.out.println("Enter array elements ");
        for (int i = 0; i < size; i++)
        {
             arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Largest " + arr[arr.length - 1]);



    }
}
