import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vladimir on 2/6/14.
 */
public class UniqueElements {
    public static void main (String[] args) {
        try {
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String [] stringArray = line.split(",");
                String result = stringArray[0];
                for (int i = 1; i < stringArray.length; i++) {
                        if (!stringArray[i].equals(stringArray[i - 1])) {
                            result = result + "," + stringArray[i];
                        }
                }
                System.out.println(result);
            }
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}
