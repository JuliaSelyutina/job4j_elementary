package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {0, 3, 5, 7, 9};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas6Then4() {
        int[] data = new int[] {9, 1, 9, 9, 6, 6, 6};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot0ThenMinus1() {
        int[] data = new int[] {1, 2, 3};
        int el = 0;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {9, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        int el = 8;
        int start = 3;
        int finish = 9;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas6Then8() {
        int[] data = new int[] {9, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        int el = 6;
        int start = 3;
        int finish = 9;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas10Then1() {
        int[] data = new int[] {9, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        int el = 10;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}
