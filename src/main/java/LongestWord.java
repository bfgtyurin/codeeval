import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

/**
 * Created by Vladimir on 16.02.14.
 */
public class LongestWord {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line =  in.readLine()) != null) {
                String result;
                String[] array = line.split("\\s");
                result = array[0];
                for (String s : array) {
                    if (result.length() < s.length()) {
                        result = s;
                    }
                }
                System.out.println(result);
            }
        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
}
