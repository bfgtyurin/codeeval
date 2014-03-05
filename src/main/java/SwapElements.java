import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Vladimir on 05.03.14.
 */
public class SwapElements {

    private static int firstSwapIndex;
    private static int secondSwapIndex;
    private static String[] array;
    private static String[] posArray;

    public static void main(String[] args) {
            File file = new File(args[0]);
            try {
                BufferedReader in = new BufferedReader(new FileReader(file));
                String line;
                while ((line = in.readLine()) != null) {
                    int begin = line.indexOf(":");
                    String pos = line.substring(begin + 2);
                    line = line.substring(0, begin - 1);
                    array = line.split("\\s");

                    if (pos.contains(",")) {
                        String[] tempArray = pos.split(", ");
                        for (String aTempArray : tempArray) {
                            swapElements(aTempArray);
                        }
                    } else {
                        swapElements(pos);
                    }

                    for (String anArray : array) {
                        System.out.print(anArray + " ");
                    }

                    System.out.println();

                }
            } catch (IOException e) {
                System.out.println("file read error: " + e.getMessage());
            }
        }

    public static void swapElements(String pos) {
        String temp;
        posArray = pos.split("-");
        firstSwapIndex = Integer.parseInt(posArray[0]);
        secondSwapIndex = Integer.parseInt(posArray[1]);
        temp = array[firstSwapIndex];
        array[firstSwapIndex] = array[Integer.parseInt(posArray[1])];
        array[secondSwapIndex] = temp;
    }
}
