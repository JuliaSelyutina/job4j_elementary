package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFor3Elements() {
        int[] data = new int[] {16, 27, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 16, 27};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFor5Elements() {
        int[] data = new int[] {34, 29, 18, 27, 31};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {18, 27, 29, 31, 34};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFor8Elements() {
        int[] data = new int[] {20, 12, 32, 44, 66, 10, 82, 24};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 12, 20, 24, 32, 44, 66, 82};
        assertThat(result).containsExactly(expected);
    }
}
