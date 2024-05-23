package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MathFuncTest {

    /**
     *     Тестирует метод squarePlusOne с положительным числом.
     *     Проверяет, что результат равен 10 при входном значении 3.
     */
    @Test
    public void whenSquarePlusOneWithPositiveNumberThenCorrectResult() {
        int result = MathFunc.squarePlusOne(3);
        assertThat(result).isEqualTo(10);
    }

    /**
     *     Тестирует метод squarePlusOne с отрицательным числом.
     *     Проверяет, что результат равен 17 при входном значении -4.
     */
    @Test
    public void whenSquarePlusOneWithNegativeNumberThenCorrectResult() {
        int result = MathFunc.squarePlusOne(-4);
        assertThat(result).isEqualTo(17);
    }

    /**
     *     Тестирует метод reciprocal с положительным числом.
     *     Проверяет, что результат равен 0.25 при входном значении 4.
     */
    @Test
    public void whenReciprocalWithPositiveNumberThenCorrectResult() {
        double result = MathFunc.reciprocal(4);
        assertThat(result).isEqualTo(0.25);
    }

    /**
     *     Тестирует метод reciprocal с нулем.
     *     Проверяет, что возникает исключение ArithmeticException с сообщением "Division by zero is not allowed."
     */
    @Test
    public void whenReciprocalWithZeroThenThrowException() {
        assertThatThrownBy(() -> MathFunc.reciprocal(0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Division by zero is not allowed.");
    }
}
