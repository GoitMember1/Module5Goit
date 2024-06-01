package org.example;

public class FibonacciIterative {
    public static int calculate(int n) {
        if (n <= 1) {
            return n;
        } else {
            int fibPrev = 0;
            int fibCurr = 1;
            for (int i = 2; i <= n; i++) {
                int temp = fibCurr;
                fibCurr = fibPrev + fibCurr;
                fibPrev = temp;
            }
            return fibCurr;
        }
    }
}
//Просторова та часова складності:
//Часова складність: O(n)
//Просторова складність: O(1)
