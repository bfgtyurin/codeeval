package com.vtyurin.solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringRotation {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] split = line.split(",");
            solution(split[0], split[1]);
        }

    }

    private static void solution(String word, String possible) {
        String result = "False";

        if (word.length() == possible.length()) {

            for (int i = 1; i < word.length(); i++) {

                String left = word.substring(i);
                String right = word.substring(0, i);
                String rotated = left + right;

                if (rotated.equals(possible)) {
                    result = "True";
                }
            }
        }

        System.out.println(result);
    }
}
