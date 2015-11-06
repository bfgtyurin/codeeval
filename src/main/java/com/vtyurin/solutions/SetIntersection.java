package com.vtyurin.solutions;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

/**
 * Created by vladimir on 2/15/14.
 */
public class SetIntersection {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String result = "";
                int begin = line.indexOf(";");
                String firstList = line.substring(0, begin);
                String secondList = line.substring(begin + 1, line.length());

                String[] firstArray = firstList.split(",");
                String[] secondArray = secondList.split(",");

                for (String aFirstArray : firstArray) {
                    for (String aSecondArray : secondArray) {
                        if (aFirstArray.equals(aSecondArray)) {
                            result += aFirstArray + ",";
                        }
                    }
                }
                if (result.length() > 0) {
                    result = result.substring(0, result.length() - 1);
                }
                System.out.println(result);
            }
        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
}