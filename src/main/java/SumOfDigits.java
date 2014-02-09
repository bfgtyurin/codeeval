import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vladimir on 2/9/14.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                int temp = Integer.parseInt(line);
                int result = 0;
                while (temp != 0) {
                    result = result + temp % 10;
                    temp = temp / 10;
                }
                System.out.println(result);
            }

        } catch (IOException e) {
            System.out.println("File read error" + e.getMessage());

        }
    }
}
