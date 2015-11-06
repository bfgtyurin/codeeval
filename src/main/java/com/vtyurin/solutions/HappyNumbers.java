package com.vtyurin.solutions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Vladimir on 04.03.14.
 */
public class HappyNumbers {

    private static final ArrayList<Integer> NUMBERS = new ArrayList<>();

    public static void main(String[] args) {

        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(isHappy(Integer.parseInt(line)));
                NUMBERS.clear();
            }
        } catch (IOException e) {
            System.out.println("file read error: " + e.getMessage());
        }
    }

    public static int isHappy(int number) {
        NUMBERS.add(number);
        while (true) {
            if (number == 1) {
                return 1;
            }
            number = square(number);
            if (NUMBERS.contains(number)) {
                return 0;
            }
            NUMBERS.add(number);
        }
    }

    public static int square(int number) {
        int result = 0;
        if (number < 10) {
            result = number * number;
            return result;
        } else {
            while (number != 0) {
                result = result + (number % 10) * (number % 10);
                number = number / 10;
            }
            return result;
        }
    }
}
