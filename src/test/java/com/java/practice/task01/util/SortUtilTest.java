package com.java.practice.task01.util;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SortUtilTest {
    private static final int[] ARRAY = {2, 4, -10, 3, -40, 2, 100, -1000, 0, 59};
    SortUtil sortUtil = new SortUtil();

    @Test
    public void bubbleSortWithFor() {
        int[] expected = Arrays.copyOf(ARRAY, ARRAY.length);
        Arrays.sort(expected);
        sortUtil.bubbleSortWithFor(ARRAY);
        assertArrayEquals(expected, ARRAY);
    }

    @Test
    public void bubbleSortWithWhile() {
        int[] expected = Arrays.copyOf(ARRAY, ARRAY.length);
        Arrays.sort(expected);
        sortUtil.bubbleSortWithWhile(ARRAY);
        assertArrayEquals(expected, ARRAY);
    }

    @Test
    public void insertionSort() {
        int[] expected = Arrays.copyOf(ARRAY, ARRAY.length);
        Arrays.sort(expected);
        sortUtil.insertionSort(ARRAY);
        assertArrayEquals(expected, ARRAY);
    }

    @Test
    public void selectionSort() {
        int[] expected = Arrays.copyOf(ARRAY, ARRAY.length);
        Arrays.sort(expected);
        sortUtil.selectionSort(ARRAY);
        assertArrayEquals(expected, ARRAY);
    }

    @Test
    public void quickSort() {
        int[] expected = Arrays.copyOf(ARRAY, ARRAY.length);
        Arrays.sort(expected);
        sortUtil.quickSort(ARRAY);
        assertArrayEquals(expected, ARRAY);
    }

    @Test
    public void mergeSort() {
        int[] expected = Arrays.copyOf(ARRAY, ARRAY.length);
        Arrays.sort(expected);
        sortUtil.mergeSort(ARRAY);
        assertArrayEquals(expected, ARRAY);
    }
}