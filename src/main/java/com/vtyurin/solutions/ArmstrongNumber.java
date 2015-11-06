package com.vtyurin.solutions;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by Vladimir on 03.03.14.
 */
public class ArmstrongNumber {
    private static final ArrayList<Integer> NUMBERS = new ArrayList<>();

    public static void main(String[] args) {
            File file = new File(args[0]);
            try {
                BufferedReader in = new BufferedReader(new FileReader(file));
                String line;
                while ((line = in.readLine()) != null) {
                    int temp = Integer.parseInt(line);
                    if (isArmstrong(temp)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                }
            } catch (IOException e) {
                System.out.println("file read error: " + e.getMessage());
            }
        }

    public static boolean isArmstrong(int number) {
        int original = number;
        int power = 0;
        int result = 0;
        while (number != 0) {
            power++;
            NUMBERS.add(number % 10);
            number = number / 10;
        }
        for (Integer i : NUMBERS) {
            result += Math.pow(i , power);
        }
        NUMBERS.clear();
        return result == original;
    }
}