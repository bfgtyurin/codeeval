import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by doctor on 2/4/14.
 */
public class ReverseWords {
    public static void main (String[] args) {

        try {
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] lineArray = line.split("\\s");

                if (lineArray.length > 0) {
                    // Process line of input Here
                    for (int i = lineArray.length - 1; i >= 0; i--) {
                        System.out.print(lineArray[i]);
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}
