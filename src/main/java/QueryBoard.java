import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladimir on 19.03.14.
 */
public class QueryBoard {

    private static final List<Integer> values = new ArrayList<>();
    private static final int[][] board = new int[256][256];

    public static void main(String[] args) {
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] input = line.split("\\s");
                addValues(input);
                getCommandAndExecute(input[0]);
            }
        } catch (IOException e) {
            System.out.println("file read error: " + e.getMessage());
        }
    }

    private static void addValues(String[] input) {
        for (int i = 1; i < input.length; i++) {
            values.add(Integer.parseInt(input[i]));
        }
    }

    private static void getCommandAndExecute(String input) {
        switch (input) {
            case "SetCol":
                setCol();
                break;
            case "SetRow":
                setRow();
                break;
            case "QueryCol":
                queryCol();
                break;
            case "QueryRow":
                queryRow();
                break;
        }
    }

    private static void setCol() {
        for (int i = 0; i < board.length; i++) {
            board[i][values.get(0)] = values.get(1);
        }
        values.clear();
    }

    private static void setRow() {
        for (int i = 0; i < board.length; i++) {
            board[values.get(0)][i] = values.get(1);
        }
        values.clear();
    }

    private static void queryCol() {
        int output = 0;
        for (int i = 0; i < board.length; i++) {
            output += board[i][values.get(0)];
        }
        System.out.println(output);
        values.clear();
    }

    private static void queryRow() {
        int output = 0;
        for (int i = 0; i < board.length; i++) {
            output += board[values.get(0)][i];
        }
        System.out.println(output);
        values.clear();
    }
}

