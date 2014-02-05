import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by doctor on 2/5/14.
 */
public class FibonacciSeries {
    public static void main(String[] args) {

        try {
            File file = new File(args[0]);
            Scanner in = new Scanner(new FileReader(file));
            //String line;
            while (in.hasNextInt()) {
                int number = in.nextInt();
                int i = 2;
                int x = 1;
                int y = 1;
                int result = 0;
                while (i < number) {
                    result = x + y;
                    x = y;
                    y = result;
                    i++;
                }
                System.out.println(result);
            }
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}
