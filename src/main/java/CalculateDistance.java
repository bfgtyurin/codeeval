import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Vladimir on 07.03.14.
 */
public class CalculateDistance {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                int [] xValue = new int [2];
                int [] yValue = new int[2];
                String [] array = line.split("\\)\\s\\(");
                array[0] = array[0].substring(1, array[0].length());
                array[1] = array[1].substring(0, array[1].length() - 1);

                for (int i = 0; i < 2; i++) {
                    int separator = array[i].indexOf(",");
                    xValue[i] = Integer.parseInt(array[i].substring(0, separator));
                    yValue[i] = Integer.parseInt(array[i].substring(separator + 2, array[i].length()));
                }

                int result = (int) Math.sqrt((xValue[0] - xValue[1]) * (xValue[0] - xValue[1])
                        + (yValue[0] - yValue[1]) * (yValue[0] - yValue[1]));
                System.out.println(result);
            }
        } catch (IOException e) {
            System.out.println("file read error: " + e.getMessage());
        }
    }
}
