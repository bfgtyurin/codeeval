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
        if(number < 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
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
        String initial = Integer.toString(number);
        String rev = new StringBuilder(initial).reverse().toString();
        return initial.equals(rev);
    }
}
