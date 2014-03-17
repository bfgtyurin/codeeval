import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Vladimir on 17.03.14.
 */
public class MorseCode {
    public static void main(String[] args) {
            File file = new File(args[0]);
            try {
                BufferedReader in = new BufferedReader(new FileReader(file));
                String line;
                while ((line = in.readLine()) != null) {
                    String [] code = line.split("\\s");
                    for (String s : code) {
                        System.out.print(decode(s));
                    }
                    System.out.println();
                }
            } catch (IOException e) {
                System.out.println("file read error: " + e.getMessage());
            }
        }

    private static String decode(String code) {
        switch (code) {
            case ".-" : return "A";
            case "-..." : return "B";
            case "-.-." : return "C";
            case "-.." : return "D";
            case "." : return "E";
            case "..-." : return "F";
            case "--." : return "G";
            case "...." : return "H";
            case ".." : return "I";
            case ".---" : return "J";
            case "-.-" : return "K";
            case ".-.." : return "L";
            case "--" : return "M";
            case "-." : return "N";
            case "---" : return "O";
            case ".--." : return "P";
            case "--.-" : return "Q";
            case ".-." : return "R";
            case "..." : return "S";
            case "-" : return "T";
            case "..-" : return "U";
            case "...-" : return "V";
            case ".--" : return "W";
            case "-..-" : return "X";
            case "-.--" : return "Y";
            case "--.." : return "Z";
            case ".----" : return "1";
            case "..---" : return "2";
            case "...--" : return "3";
            case "....-" : return "4";
            case "....." : return "5";
            case "-...." : return "6";
            case "--..." : return "7";
            case "---.." : return "8";
            case "----." : return "9";
            case "-----" : return "0";
            case "" : return " ";
            default: return "error";
        }
    }
}
