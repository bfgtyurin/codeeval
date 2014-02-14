import java.io.*;

/**
 * Created by vladimir on 2/14/14.
 */
public class CapitalizeWords {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            String [] array;
            while ((line = in.readLine()) != null) {
                array = line.split("\\s");
                String result = "";
                for (int i = 0; i < array.length; i++) {
                    array[i] = array[i].substring(0, 1).toUpperCase() +
                            array[i].substring(1, array[i].length());
                }
                for (int i = 0; i < array.length; i++) {
                    result += array[i] + " ";
                }
                result = result.trim();
                System.out.println(result);
            }
        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
}
