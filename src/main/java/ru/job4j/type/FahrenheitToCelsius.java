package ru.job4j.type;

import java.util.Scanner;
import java.util.Locale;

public class FahrenheitToCelsius {
    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
        double celsius = (double) 5 * (fahrenheit - 32) / 9;
        System.out.printf(Locale.ENGLISH, "%.1f", celsius);
    }
}
