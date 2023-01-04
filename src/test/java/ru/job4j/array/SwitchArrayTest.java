package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 4, 3, 5, 6, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap3to6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 3;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 7, 5, 6, 4, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap30to0ThenTheSameArray() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 30;
        int dest = 0;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}