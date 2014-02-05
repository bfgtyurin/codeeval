import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by doctor on 2/5/14.
 */
public class MultiplesOfANumber {

    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                int start = line.indexOf(",");
                String temp = line.substring(start + 1);
                line = line.substring(0, start);
                int x = Integer.parseInt(line);
                int n = Integer.parseInt(temp);
                int i = 0;

                if (x > 0) {
                    while (x >= n * i) {
                        i++;
                    }
                    System.out.println(n * i);
                } if (x < 0) {
                    while (x <= n * i) {
                        i--;
                    }
                    System.out.println(n * i);
                }

            }

        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}

