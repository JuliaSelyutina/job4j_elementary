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
        float in1 = 240;
        float expected1 = 4;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println(in1 + " rubles are " + expected1 + " dollars. Test result : " + passed1);
        float expected2 = 3;
        boolean passed2 = expected2 != out1;
        System.out.println(in1 + " rubles are not " + expected2 + " dollars. Test result : " + passed2);
    }
}
