package com.vtyurin.solutions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Vladimir on 18.03.14.
 */
public class SelfDescribingNumbers {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                int[] numbers = new int[line.length()];
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = Integer.parseInt(line.substring(i, i + 1));
                }

                System.out.println(getResult(numbers));
            }
        } catch (IOException e) {
            System.out.println("file read error: " + e.getMessage());
        }
    }

    private static int getResult(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            int times = numbers[i];
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j])
                    count++;
                if (times == count)
                    result = 1;
                else
                    result = 0;
            }
            if (result == 0) {
                break;
            }
        }
        return result;
    }
}
