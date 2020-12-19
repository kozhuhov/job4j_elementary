package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20Then2() {

        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;

        double expected = 2.0;

        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when11to21Then1() {

        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 1;

        double expected = 1.0;

        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when15to20Then509() {

        int x1 = 1;
        int y1 = 5;
        int x2 = 2;
        int y2 = 0;

        double expected = 5.09;

        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when00to31Then316() {

        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 1;

        double expected = 3.16;

        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}