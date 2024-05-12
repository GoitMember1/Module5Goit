package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        int fibIterative = FibonacciIterative.calculate(n);
        System.out.println("Ітераційний метод: " + fibIterative);

        int fibRecursive = FibonacciRecursive.calculate(n);
        System.out.println("Рекурсивний метод: " + fibRecursive);

        int fibDynamic = FibonacciDynamic.calculate(n);
        System.out.println("Метод з використанням динамічного програмування: " + fibDynamic);
    }
}