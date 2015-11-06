package com.vtyurin.solutions;
/**
 * Created by doctor on 1/23/14.
 */
public class SumOfPrime {
    public static void main(String[] args) {
        int lastPrime = 1000;
        int sum = 0;
        int counter = 1;
        int i = 2;

        while (counter <= lastPrime) {
            if (isPrime(i)) {
                counter++;
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int number) {
        for (int i = number - 1; i > 1; i--) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
