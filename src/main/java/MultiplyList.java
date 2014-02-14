import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vladimir on 2/15/14.
 */
public class MultiplyList {
    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String result = "";

                int begin = line.indexOf("|");
                String listOne = line.substring(0, begin - 1);
                String listTwo = line.substring(begin + 2, line.length());

                String [] listOneArray = listOne.split("\\s");
                String [] listTwoArray = listTwo.split("\\s");

                for (int i = 0; i < listOneArray.length; i++) {
                    result += Integer.parseInt(listOneArray[i]) * Integer.parseInt(listTwoArray[i]) + " ";
                }

                result = result.trim();
                System.out.println(result);
            }
        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }

    }
}
