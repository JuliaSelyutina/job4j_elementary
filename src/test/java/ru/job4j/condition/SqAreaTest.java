package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void whenP16K1Square16() {
        int expected = 16;
        int p = 16;
        double k = 1;
        double out = SqArea.square(p, k);
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void whenP24K6Square17dot63() {
        double expected = 17.63;
        int p = 24;
        double k = 6;
        double out = SqArea.square(p, k);
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);
    }
}
