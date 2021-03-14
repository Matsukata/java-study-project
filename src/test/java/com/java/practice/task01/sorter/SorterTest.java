package com.java.practice.task01.sorter;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class SorterTest {
    private BubbleSorter bubbleSorter = new BubbleSorter();
    private QuickSorter quickSorter = new QuickSorter();

    @Test
    public void bubbleSort() {
        int[] array = {2, 4, -10, 3, -40, 2, 100, -1000, 0, 59};
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        bubbleSorter.sort(array);
        assertTrue(Arrays.equals(expected, array));
    }

    @Test
    public void quickSort() {
        int[] array = {2, 4, -10, 3, -40, 2, 100, -1000, 0, 59};
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        quickSorter.sort(array);
        assertTrue(Arrays.equals(expected, array));
    }
}