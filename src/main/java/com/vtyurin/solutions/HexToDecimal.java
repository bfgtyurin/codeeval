package com.vtyurin.solutions;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

class HexToDecimal {
    public static void main(String... args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while((line = br.readLine()) != null) {
            out.println(Integer.parseInt(line, 16));
        }
    }
}
