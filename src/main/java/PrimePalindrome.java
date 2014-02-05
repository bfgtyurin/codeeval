
/**
 * Created by doctor on 1/24/14.
 */
public class PrimePalindrome {
    public static void main (String[] args) {
        int i = 1000;
        int number = 1000;

        while (!isPolyndrome(number)) {
            while (!isPrime(i)) {
                i--;
            }
            number = i;
            i--;
        }
        System.out.println(number);


    }

    public static boolean isPrime(int number) {
        for (int i = number - 1; i > 1; i--) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPolyndrome(int number) {
        int x = number / 100;
        int y = (number - 100 * x) / 10;
        int z = number - 100 * x - 10 * y;
        if (x == z) {
            return true;
        }

        return false;
    }
}
