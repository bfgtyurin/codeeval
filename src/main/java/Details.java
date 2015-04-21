import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

class Details {
    public static void main(String... args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            handle(line);
        }
    }

    private static void handle(String line) {
        String[] strArray = line.split(",");
        char [][] charArray = new char[strArray.length][];
        for (int i = 0; i < strArray.length; i++) {
            charArray[i] = strArray[i].toCharArray();
        }

        printResult(charArray);
    }

    private static void printResult(char[][] arr) {
        int min = 10;
        int xPos = 0;
        int yPos = 0;

        for (int i = 0; i < arr.length; i++) {
            yPos = arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 'X') xPos = j;
                if (arr[i][j] == 'Y' && j < yPos) yPos = j;
            }
            int temp = yPos - xPos - 1;
            if (temp < min) {
                min = temp;
            }
        }

        out.println(min);
    }
}
