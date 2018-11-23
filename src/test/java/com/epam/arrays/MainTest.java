package com.epam.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.epam.arrays.ArrayTask270.getString;
import static com.epam.arrays.ArrayTask271.getWordBetweenIndex;
import static com.epam.arrays.ArrayTask272.printRow;
import static com.epam.arrays.ArrayTask272.printColum;
import static com.epam.arrays.ArrayTask273.evenElementsInArray;
import static com.epam.arrays.ArrayTask274.getWordOdd;

public class MainTest {

    char[][] array = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'u', 'v', 'w', 'x', 'y'}};
    char[][] arrayIsNotCorrect = new char[1][1];

    @Test(expected = IllegalArgumentException.class)
    public void testGetString() {
        assertEquals("aeuy", getString(array));
        assertEquals(0, getString(arrayIsNotCorrect));
    }

    @Test
    public void testGetWordBetweenIndex() {
        assertEquals("klmno", getWordBetweenIndex(array, 2, 0, 4));
    }

    @Test
    public void testPrintRow() {
        assertEquals("acegikmoqsuwy".toString(), printRow(array).toString());
    }

    @Test
    public void testPrintColum() {
        assertEquals("akugqcmwiseoy".toString(), printColum(array).toString());
    }

    @Test
    public void testEvenElementsInArray() {
        StringBuilder stringBuilder = new StringBuilder("g i q s ");
        assertEquals(stringBuilder.toString(), evenElementsInArray(array).toString());
    }

    @Test
    public void testGetWordOdd() {
        StringBuilder stringBuilder = new StringBuilder("aku  cmw  eoy ");
        assertEquals(stringBuilder.toString(), getWordOdd(array).toString());
    }
}
