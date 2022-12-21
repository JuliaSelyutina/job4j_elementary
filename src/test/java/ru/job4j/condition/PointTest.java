package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when34to08then5() {
        double expected = 5;
        int x1 = 3;
        int y1 = 4;
        int x2 = 0;
        int y2 = 8;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when17to1030then24dot7() {
        double expected = 24.7;
        int x1 = 1;
        int y1 = 7;
        int x2 = 10;
        int y2 = 30;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when1325to1827then5dot39() {
        double expected = 5.39;
        int x1 = 13;
        int y1 = 25;
        int x2 = 18;
        int y2 = 27;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void when66to54then2dot24() {
        double expected = 2.24;
        int x1 = 6;
        int y1 = 6;
        int x2 = 5;
        int y2 = 4;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }
}
