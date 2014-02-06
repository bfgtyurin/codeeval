import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vladimir on 2/6/14.
 */
public class NmodM {
    public static void main (String[] args) {

        try {
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String [] stringArray = line.split(",");
                int n = Integer.parseInt(stringArray[0]);
                int m = Integer.parseInt(stringArray[1]);
                int result = n - (n / m) * m;
                System.out.println(result);
            }
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}
