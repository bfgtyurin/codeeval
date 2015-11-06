package com.vtyurin.solutions;
import java.io.*;

/**
 * Created by Vladimir on 16.02.14.
 */
public class ShortestRepetition {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while((line = in.readLine()) != null) {
                int count = 1;
                char[] ar = line.toCharArray();
                char temp = ar[0];
                for (int i = 1; i < ar.length; i++) {
                    if (temp == ar[i]) {
                        break;
                    } else {
                        count++;
                    }
                }
                System.out.println(count);
            }
        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
}
