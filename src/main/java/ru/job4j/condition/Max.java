package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean maxLeft = left >= right;
        int result = maxLeft ? left : right;
        return result;
    }
}
