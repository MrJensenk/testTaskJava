package org.example;

public class Main {
    public static void main(String[] args) {
        int sum = sumExpression(2, 2);
        int del1 = delExpression(90, 4);
        int del2 = delExpression(10, 0);
        System.out.println(sum);
        System.out.printf("Result 1: " + del1 + "\n" + "Result 2: " + del2);
    }

    public static int sumExpression(int a, int b) {
        return a + b;
    }

    public static int delExpression(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
