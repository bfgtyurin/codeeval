import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Vladimir on 13.03.14.
 */
public class HiddenDigits {

    private static String result = "";

    public static void main(String[] args) {
            File file = new File(args[0]);
            try {
                BufferedReader in = new BufferedReader(new FileReader(file));
                String line;
                while ((line = in.readLine()) != null) {

                    System.out.println(findVisible(line));
                    result = "";

                }
            } catch (IOException e) {
                System.out.println("file read error: " + e.getMessage());
            }
        }

    private static String findVisible(String line) {

        for (int i = 0; i < line.length(); i++) {
            String tempLine = line.substring(i, i + 1);
            try {
                int temp = Integer.parseInt(tempLine);
                result += temp;
            } catch (NumberFormatException e) {
                findHidden(tempLine);
            }
        }

        if (result.isEmpty()) {
            return "NONE";
        }

        return result;
    }

    private static void findHidden(String s) {
        switch (s) {
            case "a" : result += 0;
                break;
            case "b" : result += 1;
                break;
            case "c" : result += 2;
                break;
            case "d" : result += 3;
                break;
            case "e" : result += 4;
                break;
            case "f" : result += 5;
                break;
            case "g" : result += 6;
                break;
            case "h" : result += 7;
                break;
            case "i" : result += 8;
                break;
            case "j" : result += 9;
                break;
        }
    }
}
