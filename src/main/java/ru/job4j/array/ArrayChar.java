package ru.job4j.array;

public class ArrayChar {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        if (pref.length > word.length) {
            return false;
        }
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
