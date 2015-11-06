package com.vtyurin.solutions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Vladimir on 05.03.14.
 */
public class TheMajorElement {

    public static void main(String[] args) {
        String line;
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            while ((line = in.readLine()) != null) {
                String[] stringInputArray = line.split(",");
                int[] array = new int[stringInputArray.length];
                for (int i = 0; i < stringInputArray.length; i++) {
                    array[i] = Integer.parseInt(stringInputArray[i]);
                }

                int result = findMajorElement(array, array.length);
                if (result == -1) {
                    System.out.println("None");
                } else {
                    System.out.println(result);
                }

            }
        } catch (IOException e) {
            System.out.println("file read error: " + e.getMessage());
        }
    }

    public static int findMajorElement(int[] array, int size) {
        int counter = 0;
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (counter == 0) {
                result = array[i];
            }
            if (array[i] == result) {
                counter++;
            } else {
                counter--;
            }
        }
        counter = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] == result) {
                counter++;
            }
            if (counter > size / 2) {
                return result;
            }
        }
        return -1;
    }
}