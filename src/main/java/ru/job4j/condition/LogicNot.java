package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println("12 is Even : " + LogicNot.isEven(12));
        System.out.println("12 is Positive : " + LogicNot.isPositive(12));
        System.out.println("11 is not Even : " + LogicNot.notEven(11));
        System.out.println("-2 is not Positive : " + LogicNot.notPositive(-2));
        System.out.println("1 is not Even and Positive : " + LogicNot.notEvenAndPositive(1));
        System.out.println("-7 is Even or not Positive : " + LogicNot.evenOrNotPositive(-7));
    }
}
