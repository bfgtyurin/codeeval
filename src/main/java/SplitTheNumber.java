import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Vladimir on 11.03.14.
 */
public class SplitTheNumber {
    private static final String PLUS = "+";
    private static final String MINUS = "-";

    public static void main(String[] args) {
            File file = new File(args[0]);
            try {
                BufferedReader in = new BufferedReader(new FileReader(file));
                String line;
                while ((line = in.readLine()) != null) {
                    String [] tempArray = line.split("\\s");
                    String number = tempArray[0];
                    String pattern = tempArray[1];
                    System.out.println(process(number, pattern));
                }
            } catch (IOException e) {
                System.out.println("file read error: " + e.getMessage());
            }
        }

    private static int process(String number, String pattern) {

        int separator = getSeparatorIndex(pattern);

        int numberOne = parseNumberOne(number, separator);
        int numberTwo = parseNumberTwo(number, separator);
        int result = 0;

        String operator = getOperator(pattern);
        switch (operator) {
            case "+" : result = numberOne + numberTwo;
                break;
            case "-" : result = numberOne - numberTwo;
                break;
        }

        return result;

    }

    private static int getSeparatorIndex(String pattern) {
        if (pattern.contains(MINUS)) {
            return pattern.indexOf(MINUS);
        } else {
            return pattern.indexOf(PLUS);
        }
    }

    private static int parseNumberOne(String number, int separator) {
        number = number.substring(0, separator);
        return Integer.parseInt(number);
    }

    private static int parseNumberTwo(String number, int separator) {
        number = number.substring(separator);
        return Integer.parseInt(number);
    }

    private static String getOperator(String pattern) {
        if (pattern.contains(MINUS)) {
            return MINUS;
        } else {
            return PLUS;
        }
    }
}
