package com.vtyurin.solutions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by doctor on 2/5/14.
 */
public class RemoveCharacters {
    public static void main (String[] args) {

        try {
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                int start = line.indexOf(",");
                String temp = line.substring(start + 2);
                line = line.substring(0, start);
                System.out.println(temp.length());
                for (int i = 0; i < temp.length(); i++) {
                    String s = String.valueOf(temp.charAt(i));
                    line = line.replaceAll(s, "");
                }

                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}
