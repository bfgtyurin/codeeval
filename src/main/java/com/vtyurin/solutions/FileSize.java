package com.vtyurin.solutions;
import java.io.File;

/**
 * Created by vladimir on 2/10/14.
 */
public class FileSize {
    public static void main(String[] args) {
        File file = new File(args[0]);
        System.out.println(file.length());
    }
}
