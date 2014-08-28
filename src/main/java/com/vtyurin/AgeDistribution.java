package com.vtyurin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author tyurin
 */
public class AgeDistribution {
    private static final String ERROR = "This program is for humans";
    
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            Scanner in = new Scanner(new FileReader(file));
            while (in.hasNextInt()) {
                process(in.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
    
    public static void process(int age) {
        if (isValid(age)) {
            distribute(age);
        } else {
            System.out.println(ERROR);
        }
    }
    
    private static boolean isValid(int age) {
        return (age > 0 && age <= 100);
    }
    
    public static void distribute(int age) {
        if (age > 65) {
            System.out.println("The Golden Years");
        } else if (age > 25) {
            System.out.println("Working for the man");
        } else if (age > 18) {
            System.out.println("College");
        } else if (age > 14) {
            System.out.println("High school");
        } else if (age > 11) {
            System.out.println("Middle school");
        } else if (age > 4) {
            System.out.println("Elementary school");
        } else if (age > 2) {
            System.out.println("Preschool Maniac");
        } else {
            System.out.println("Still in Mama's arms");
        }
    }
}
