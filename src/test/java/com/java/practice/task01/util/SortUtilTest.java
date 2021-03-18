package com.java.practice.task01.util;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SortUtilTest {
    private static final int[] ARRAY = {2, 4, -10, 3, -40, 2, 100, -1000, 0, 59};
    SortUtil sortUtil = new SortUtil();

    @Test
    public void bubbleSortWithFor() {
        int[] array = SortUtilTest.ARRAY;
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        sortUtil.bubbleSortWithFor(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void bubbleSortWithWhile() {
        int[] array = SortUtilTest.ARRAY;
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        sortUtil.bubbleSortWithWhile(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void insertionSort() {
        int[] array = SortUtilTest.ARRAY;
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        sortUtil.insertionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void selectionSort() {
        int[] array = SortUtilTest.ARRAY;
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        sortUtil.selectionSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void quickSort() {
        int[] array = SortUtilTest.ARRAY;
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        sortUtil.quickSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void mergeSort() {
        int[] array = SortUtilTest.ARRAY;
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        sortUtil.mergeSort(array);
        assertArrayEquals(expected, array);
    }
}