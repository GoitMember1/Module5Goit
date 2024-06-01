package org.example;

public class FibonacciRecursive {
    public static int calculate(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculate(n - 1) + calculate(n - 2);
        }
    }
}
//Просторова та часова складності:
//Часова складність: O(2^n)
//Просторова складність: O(n) (глибина рекурсії)