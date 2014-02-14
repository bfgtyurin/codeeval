import java.io.*;

/**
 * Created by vladimir on 2/14/14.
 */
public class PenultimateWord {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            String [] array;
            while ((line = in.readLine()) != null) {
                array = line.split("\\s");
                System.out.println(array[array.length - 2]);
            }
        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
}
