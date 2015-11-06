package com.vtyurin.solutions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vladimir on 2/15/14.
 */
public class WordToDigit {
    public static void main(String[] args) {
        File file = new File(args[0]);
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] wordsArray = line.split(";");
                for (String word : wordsArray) {
                    System.out.print(whatANumber(word));
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }

    private static int whatANumber(String s) {
        int number = 0;
        switch (s) {
            case "zero":
                number = 0;
                break;
            case "one":
                number = 1;
                break;
            case "two":
                number = 2;
                break;
            case "three":
                number = 3;
                break;
            case "four":
                number = 4;
                break;
            case "five":
                number = 5;
                break;
            case "six":
                number = 6;
                break;
            case "seven":
                number = 7;
                break;
            case "eight":
                number = 8;
                break;
            case "nine":
                number = 9;
                break;
        }
        return number;
    }
}
