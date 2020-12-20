package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {

        int in = 5;
        int expected = 120;
        int out = Factorial.calc(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int expected = 0;
        int out = Factorial.calc(in);
        Assert.assertEquals(expected, out);
    }
}