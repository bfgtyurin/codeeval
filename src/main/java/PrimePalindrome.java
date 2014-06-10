
/**
 * Created by doctor on 1/24/14.
 */
public class PrimePalindrome {
    public static void main (String[] args) {
        int number = 1000;
        for (; number > 2; number--) {
            if (isPrime(number) && isPalindrome(number)) {
                System.out.println(number);
                break;
            }
        }
    }

    public static boolean isPrime(int number) {
        int dem = 2;
        if(number == 2) {
            return true;
        }
        while (dem < number) {
            if ((number % dem) == 0) {
                return false;
            }
            else {
                dem++;
            }
        }
        return true;
    }

    public static int reverse(int number) {
        int temp = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            temp = temp * 10 + lastDigit;
            number = number / 10;
        }
        return temp;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
    // check Palindrome with using string
    public static boolean isPalindrome2(int number) {
        String temp = Integer.toString(number);
        String rev = new StringBuilder(temp).reverse().toString();
        return temp.equals(rev);
    }
}
