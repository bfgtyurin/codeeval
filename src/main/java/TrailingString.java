import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by doctor on 2/5/14.
 */
public class TrailingString {
    public static void main (String[] args) {

        try {
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                int start = line.indexOf(",") + 1;
                String temp = line.substring(start);
                line = line.substring(0, start - 1);

                if (line.contains(temp)) System.out.println(1);
                else System.out.println(0);
            }
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}

