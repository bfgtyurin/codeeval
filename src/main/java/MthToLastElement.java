import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by doctor on 2/5/14.
 */
public class MthToLastElement {
    public static void main (String[] args) {

        try {
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String [] s = line.split("\\s");
                int point = Integer.parseInt(s[s.length - 1]);

                String [] temp = new String[s.length];
                for (int i = 0; i < s.length; i++) {
                    temp[i] = s[s.length - 1 - i];
                }
                if (point <= temp.length) {
                    System.out.println(temp[point]);
                }

            }
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}
