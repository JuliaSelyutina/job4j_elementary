package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To12To7To30Then12() {
        int first = 10;
        int second = 12;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To12To7Then30() {
        int first = 10;
        int second = 12;
        int third = 7;
        int fourth = 30;
        int result = Max.max(first, second, third, fourth);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }
}
