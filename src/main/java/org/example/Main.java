package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double sum = calc.sumExpression(2.0, 2.0);
        double del1 = calc.delExpression(90.0, 4.0);
        double del2 = calc.delExpression(10.0, 0.0);
        System.out.println(sum);
        System.out.printf("Result 1: " + del1 + "\n" + "Result 2: " + del2);
    }
}
