import java.io.*;

import static java.util.Arrays.copyOfRange;
import static java.lang.System.out;

class MaxRangeSum {
    public static void main(String... args) throws IOException {
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while((line = reader.readLine()) != null) {
            line = line.trim();
            handle(line);
        }
    }

    private static void handle(String line) {
        String[] array = line.split(";");
        gains(Integer.parseInt(array[0]), array[1]);
    }

    private static void gains(int fromDay, String period) {
        String[] days = period.split("\\s");
        int result = 0;
        for (int i = 0; i <= days.length - fromDay; i++) {
            int sum = 0;
            for (int j = 0; j < fromDay; j++) {
                sum += Integer.parseInt(days[j + i]);
            }
            if (sum > result) result = sum;
        }

        out.println(result);
    }
}
