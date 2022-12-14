package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int rubles = 140;
        float euro = Converter.rubleToEuro(rubles);
        float dollar = Converter.rubleToDollar(rubles);
        System.out.printf("%d rubles are %s euro.%n", rubles, euro);
        System.out.printf("%d rubles are %s dollar.%n", rubles, dollar);
    }
}
