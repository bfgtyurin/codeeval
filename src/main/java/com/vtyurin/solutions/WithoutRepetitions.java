package com.vtyurin.solutions;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WithoutRepetitions {
    
    public static void main(String[] args) throws IOException {
        List<String> input = Files.readAllLines(Paths.get(args[0]), StandardCharsets.UTF_8);
        for (String line : input) {
            solution(line);
        }
    }
    
    public static void solution(String line) {
        char[] arr = line.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]) {
                result.append(arr[i]);
            }
        }
        result.append(arr[arr.length-1]);
        System.out.println(result);
    }

}
