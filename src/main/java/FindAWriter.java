import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Vladimir on 16.02.14.
 */
public class FindAWriter {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                if (line.length() > 0) {
                    String result = "";
                    int point = line.indexOf("|");
                    String keys = line.substring(point + 2, line.length());
                    line = line.substring(0, point);
                    String[] keysArray = keys.split("\\s");
                    for (String s : keysArray) {
                        result += line.charAt(Integer.parseInt(s) - 1);
                    }
                    System.out.println(result);
                }
            }
        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
}
