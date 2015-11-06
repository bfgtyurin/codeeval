package com.vtyurin.solutions;
import java.io.*;

/**
 * Created by vladimir on 2/9/14.
 */
public class MixedContent {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] array = line.split(",");
                String d = "";
                String w = "";
                for (int i = 0; i < array.length; i++) {
                    String s = array[i];
                    char c = s.charAt(0);
                    if ((c >= '0') && (c <= '9')) {
                        d += s + ",";
                    } else {
                        w += s + ",";
                    }
                }
                if (w.length() > 0) {
                    w = w.substring(0, w.length() - 1);
                    if (d.length() > 0) {
                        w = w + "|";
                    }

                }
                if (d.length() > 0) {
                    d = d.substring(0, d.length() - 1);
                }
                System.out.println(w + d);
            }


        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
}
