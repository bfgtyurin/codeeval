package com.vtyurin.solutions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * Created by vladimir on 2/7/14.
 */
public class CompressedSequence {
    public static final String SPACE = " ";
    public static void main (String[] args) {
        try {
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String [] array = line.split("\\s");
                int[] intArray = new int [array.length];
                for (int j = 0; j < intArray.length; j++ ) {
                    intArray[j] = Integer.parseInt(array[j]);
                }
                int counter = 1;
                int last = intArray[0];
                for (int i = 1; i < intArray.length; i++) {
                    if (last == (intArray[i])) {
                        counter++;
                    } else {
                        System.out.print(counter + SPACE + last + SPACE);
                        last = intArray[i];
                        counter = 1;
                    }
                 }
                System.out.print(counter + SPACE + last + SPACE);
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}
