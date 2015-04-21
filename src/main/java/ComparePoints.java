import java.io.*;

import static java.lang.System.out;

class ComparePoints {
    public static void main(String... args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            handle(line);
        }
    }

    private static void handle(String line) {
        String[] raw = line.split("\\s");
        int[] coords = toIntArray(raw);
        out.println(check(coords[0], coords[1], coords[2], coords[3]));
    }

    private static int[] toIntArray(String[] strArray) {
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        return intArray;
    }

    private static String check(int curX, int curY, int locX, int locY) {
        if (curX == locX && curY == locY) {
            return "here";
        }

        StringBuilder sb = new StringBuilder();
        if (curY < locY) {
            sb.append("N");
        }
        if (curY > locY) {
            sb.append("S");
        }
        if (curX < locX) {
            sb.append("E");
        }
        if (curX > locX) {
            sb.append("W");
        }

        return sb.toString();
    }
}
