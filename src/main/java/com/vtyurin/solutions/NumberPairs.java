package com.vtyurin.solutions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Vladimir on 10.03.14.
 */
public class NumberPairs {
    private static final String SEPARATOR = ";";

    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                int separator = line.indexOf(SEPARATOR);
                int sumX = Integer.parseInt(line.substring(separator + 1));
                line = line.substring(0, separator);

                String[] temp = line.split(",");
                ArrayList<Integer> numbers = new ArrayList<>();
                for (int i = 0; i < temp.length; i++) {
                    numbers.add(i, Integer.parseInt(temp[i]));
                }

                String result = "";
                for (int i = 0; i < numbers.size(); i++) {
                    for (Integer numberTwo : numbers) {
                        int tempSum = numbers.get(i) + numberTwo;
                        if (tempSum == sumX & numbers.get(i) < numberTwo) {
                            result += String.valueOf(numbers.get(i)) + ","
                                    + String.valueOf(numberTwo) + SEPARATOR;
                        }
                    }
                }

                if (result.isEmpty()) {
                    System.out.println("NULL");
                } else
                    System.out.println(result.substring(0, result.length() - 1));
            }
        } catch (IOException e) {
            System.out.println("file read error: " + e.getMessage());
        }
    }
}
