package com.vtyurin.solutions;
import java.io.*;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] array = line.split(" ");
            fizzBuzz(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]));
        }
        reader.close();
    }

    public static void fizzBuzz(int fizzNumber, int buzzNumber, int howLong) {
        StringBuilder output = new StringBuilder("");
        for (int i = 1; i <= howLong; i++) {
            if (i % fizzNumber == 0 && i % buzzNumber == 0) {
                output.append("FB");
            } else if (i % fizzNumber == 0) {
                output.append("F");
            } else if (i % buzzNumber == 0) {
                output.append("B");
            } else {
                output.append(i);
            }
            output.append(" ");
        }
        String result = output.toString().trim();
        System.out.println(result);
    }
}
