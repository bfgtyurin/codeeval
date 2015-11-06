package com.vtyurin.solutions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Vladimir on 16.02.14.
 */
public class RightmostChar {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] array = line.split(",");
                System.out.println(array[0].lastIndexOf(array[1]));
            }
        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
}
