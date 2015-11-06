package com.vtyurin.solutions;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Vladimir on 16.02.14.
 */
public class EvenNumbers {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            Scanner in = new Scanner(new FileReader(file));
            while (in.hasNextInt()) {
                if ((in.nextInt() % 2) != 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            }
        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
}
