package com.bbd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */

public class AppTest
{
    @Test
    public void testNumber1()
    {
        assertEquals(1, RomanConverter.Convert("I"));
    }

    @Test
    public void testNumber2()
    {
        assertEquals(2, RomanConverter.Convert(("II")));
    }

    @Test
    public void testNumber5()
    {
        assertEquals(5, RomanConverter.Convert("V"));
    }
    @Test
    public void testTwoDifferentNumbers()
    {
        assertEquals(6, RomanConverter.Convert("VI"));
    }

    @Test
    public void testSmallchar()
    {
        assertEquals(6, RomanConverter.Convert("vi"));
    }

    @Test
    public void testXChars()
    {
        assertEquals(10,RomanConverter.Convert("X"));
    }

    @Test
    public void testLChars()
    {
        assertEquals(50,RomanConverter.Convert("L"));
    }

    @Test
    public void testCChars()
    {
        assertEquals(100,RomanConverter.Convert("C"));
    }

    @Test
    public void testDChars()
    {
        assertEquals(500,RomanConverter.Convert("D"));
    }

    @Test
    public void testMChars()
    {
        assertEquals(1000,RomanConverter.Convert("M"));
    }

    @Test
    public void testInvalidChar ()
    {
        assertThrows(RuntimeException.class, () -> RomanConverter.Convert("A"));
    }

    @Test
    public void testNullChar ()
    {
        assertThrows(RuntimeException.class, () -> RomanConverter.Convert(""));
    }

    @Test
    public void testIfFourSameInRow ()
    {
        assertThrows(RuntimeException.class, () -> RomanConverter.Convert("IIII"));
    }

    @Test
    public void testIfSubtractIV ()
    {
        assertEquals(4,RomanConverter.Convert("IV"));
    }

    @Test
    public void testIfSubtractIX ()
    {
        assertEquals(9,RomanConverter.Convert("ix"));
    }

    @Test
    public void testIfSubtractXL ()
    {
        assertEquals(40,RomanConverter.Convert("xl"));
    }

    @Test
    public void testIfSubtractXC ()
    {
        assertEquals(90,RomanConverter.Convert("xc"));
    }

    @Test
    public void testIfSubtractCD ()
    {
        assertEquals(400,RomanConverter.Convert("cd"));
    }

    @Test
    public void testIfSubtractCM ()
    {
        assertEquals(900,RomanConverter.Convert("CM"));
    }

    public void testIfSubtractCMXCIX ()
    {
        assertEquals(999,RomanConverter.Convert("CMXCIX"));
    }
}
