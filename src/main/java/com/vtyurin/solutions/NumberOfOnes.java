package com.vtyurin.solutions;

import java.io.*;

public class NumberOfOnes {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = reader.readLine()) != null) {

            int i = Integer.parseInt(line);
            System.out.println(Integer.bitCount(i));
        }
    }
}
