package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP1K1then006() {

        int p = 1;
        int k = 1;

        double expected = 0.06;

        double out = SqArea.square(p, k);

        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP1K5then0034() {

        int p = 1;
        int k = 5;

        double expected = 0.034;

        double out = SqArea.square(p, k);

        Assert.assertEquals(expected, out, 0.001);

    }

    @Test
    public void whenP0K0then0() {

        int p = 0;
        int k = 0;

        double expected = 0.0;

        double out = SqArea.square(p, k);

        Assert.assertEquals(expected, out, 0.01);

    }
}