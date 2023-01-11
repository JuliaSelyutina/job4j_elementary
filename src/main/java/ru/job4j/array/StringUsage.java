package ru.job4j.array;

public class StringUsage {
    public static void main(String[] args) {
        String text = "Smith Will";
        // 1. Преобразование строки в массив. String.toCharArray()
        char[] array = text.toCharArray();
        System.out.println(array);
        // 2. Преобразование массива в строку. String.valueOf()
        char[] array1 = {'j', 'o', 'b', '4', 'j'};
        text = String.valueOf(array1);
        System.out.println(text);
        // 3. Извлечение символа из строки. String.charAt()
        text = "Smith Will";
        char surnameStart = text.charAt(6);
        System.out.println(surnameStart);
        //4. Поиск строки в подстроке. String.indexOf(). Метод indexOf вернет индекс символа в исходной строке с которого начинается подстрока.
        text = "Smith Will";
        String subtext = "Wi";
        int index = text.indexOf(subtext);
        System.out.println(index);
        // метод indexOf, который принимает два параметра. Второй параметр указывает на индекс начала поиска подстроки.
        text = "Smith Will, He has a friend William.";
        subtext = "Wi";
        index = text.indexOf(subtext, 7);
        System.out.println(index);
        // 5. Извлечение подстроки по индексам. String.substring(fromIndex, toIndex).
        text = "will_smith@gmail.com";
        int mailIndex = text.indexOf("@") + 1;
        int end = text.length();
        String domain = text.substring(mailIndex, end);
        System.out.println(domain);
        // 6. Получение кода символа. Все символы имеют уникальный код в таблице Unicode. String.codePointAt()
        index = domain.codePointAt(0);
        System.out.println(index);
    }
}
