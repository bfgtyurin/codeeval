package com.vtyurin.solutions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class AgeDistribution {
    private static final String ERROR = "This program is for humans";
    
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            Scanner in = new Scanner(new FileReader(file));
            while (in.hasNextInt()) {
                System.out.println(distribute(in.nextInt()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
    
    public static String distribute(int age) {
        if (age < 0 || age > 100) {
            return ERROR;
        } else if (age > 65) {
            return "The Golden Years";
        } else if (age > 25) {
            return "Working for the man";
        } else if (age > 18) {
            return "College";
        } else if (age > 14) {
            return "High school";
        } else if (age > 11) {
            return "Middle school";
        } else if (age > 4) {
            return "Elementary school";
        } else if (age > 2) {
            return "Preschool Maniac";
        } else {
            return "Still in Mama's arms";
        }
    }
}
