package pack_Methods;

import java.util.Scanner;

public class GreaterNo {
    public static void main(String[] args) {
        float floatValue = 4.52f;
        int integerValue = convertFloatToInt(floatValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Integer value: " + integerValue);
    }

    public static int convertFloatToInt(float floatValue) {
        return (int) floatValue;
    }
}

