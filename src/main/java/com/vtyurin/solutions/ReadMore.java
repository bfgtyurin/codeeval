package com.vtyurin.solutions;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadMore {
    
    private static final String suffix = "... <Read More>";
    
    private List<String> rawInput;
    
    public static void main(String[] args) throws IOException {
        ReadMore task = new ReadMore();
        task.rawInput = Files.readAllLines(Paths.get(args[0]), StandardCharsets.UTF_8);
        task.solve();
    }
    
    public void solve() {
        for (String s : rawInput) {
            if (s.length() <= 55) {
                System.out.println(s);
            } else {
                s = s.substring(0, 40);
                if (s.contains(" ")) {
                    s = s.substring(0, s.lastIndexOf(" "));
                }
                System.out.println(s.concat(suffix));
            }
        }
    }

}
