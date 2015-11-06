package com.vtyurin.solutions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Created by Vladimir on 10.03.14.
 */
public class LongestLines {

    private static final TreeMap<Integer, String> threeMap = new TreeMap<>();

    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            int lines = Integer.parseInt(in.readLine());
            String line;
            while ((line = in.readLine()) != null) {
                threeMap.put(line.length(), line);
            }

            for (int i = 0; i < lines; i++) {
                System.out.println(threeMap.pollLastEntry().getValue());
            }

        } catch (IOException e) {
            System.out.println("file read error: " + e.getMessage());
        }
    }
}
