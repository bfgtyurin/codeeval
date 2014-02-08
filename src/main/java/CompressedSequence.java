import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vladimir on 2/7/14.
 */
public class CompressedSequence {
    public static void main (String[] args) {
        try {
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String [] array = line.split("\\s");
                int counter = 1;
                String last = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (last.equals(array[i])) {
                        counter++;
                    } else {
                        System.out.print(counter + " " + last + " ");
                        last = array[i];
                        counter = 1;
                    }
                 }
                System.out.print(counter + " " + last + " ");
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}
