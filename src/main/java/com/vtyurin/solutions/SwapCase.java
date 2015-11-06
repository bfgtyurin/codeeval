package com.vtyurin.solutions;
import java.io.*;

/**
 * Created by vladimir on 2/14/14.
 */
public class SwapCase {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String temp;
                String result = "";
                for (int i = 0; i < line.length(); i++) {
                    temp = line.substring(i, i + 1);
                    if (temp.toLowerCase().equals(temp)) {
                        result = result + temp.toUpperCase();
                    } else {
                        result = result + temp.toLowerCase();
                    }
                }
                System.out.println(result);
            }

        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
}
