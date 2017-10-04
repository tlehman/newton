package com.tobilehman.newton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {
    @Test
    public void testAdditionAndEquals() {
        Point a = new Point(0.0, 0.1, 0.0);
        Point b = new Point(0.1, 0.0, 0.0);
        Point c = new Point(0.1, 0.1, 0.0);

        assertEquals(a.plus(b), c);
    }

    @Test
    public void testMinus() {
        Point a = new Point(0.0, 0.0, 0.0);
        Point b = new Point(1.0, 2.0, 3.0);
        Vector v = new Vector(-1.0, -2.0 ,-3.0);

        assertEquals(a.minus(b), v);
    }
}
