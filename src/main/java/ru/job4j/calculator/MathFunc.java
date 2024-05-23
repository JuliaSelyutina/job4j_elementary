package ru.job4j.calculator;

public class MathFunc {

    public static int squarePlusOne(int x) {
        return x * x + 1;
    }

    public static double reciprocal(int x) {
        if (x == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return 1.0 / x;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.squarePlusOne(3);
        double result2 = MathFunc.reciprocal(5);
        double total = result1 + result2;
        System.out.println(total);
        int result3 = MathFunc.squarePlusOne(100);
        System.out.println(result3);
    }
}
