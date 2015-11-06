package com.vtyurin.solutions;
import java.io.*;

/**
 * Created by vladimir on 2/6/14.
 */

public class SumOfIntegersFromFile {
    public static void main (String[] args) {
        try {
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            int result = 0;
            while ((line = in.readLine()) != null) {
                result = result + Integer.parseInt(line);
            }
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}
