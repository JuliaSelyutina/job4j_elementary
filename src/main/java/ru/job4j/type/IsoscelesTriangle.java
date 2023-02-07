package ru.job4j.type;

import java.util.Locale;

public class IsoscelesTriangle {
    public static void calculate(int base, int height) {
        double area = base * height * 0.5;
        double perimeter = 2 * (base + height);
        System.out.printf(Locale.ENGLISH, "%.1f%n%.1f", area, perimeter);
    }
}
