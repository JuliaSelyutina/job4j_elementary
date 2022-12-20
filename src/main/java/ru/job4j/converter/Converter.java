package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles are " + expected + " euro. Test result : " + passed);
        in = 240;
        expected = 4;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println(in + " rubles are " + expected + " dollars. Test result : " + passed);
        expected = 3;
        passed = expected != out;
        System.out.println(in + " rubles are not " + expected + " dollars. Test result : " + passed);
    }
}
