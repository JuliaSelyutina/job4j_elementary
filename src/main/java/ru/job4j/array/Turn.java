package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
            int middleOfArray = array.length / 2;
            int tempValue;
            int tempIndex;
            for (int i = 0; i < middleOfArray; i++) {
                tempValue = array[i];
                tempIndex = array.length - i - 1;
                array[i] = array[tempIndex];
                array[tempIndex] = tempValue;
            }
            return array;
        }
}
