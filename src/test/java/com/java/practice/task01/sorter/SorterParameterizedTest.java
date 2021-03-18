package com.java.practice.task01.sorter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class SorterParameterizedTest {
    private final BubbleSorter bubbleSorter = new BubbleSorter();
    private final QuickSorter quickSorter = new QuickSorter();

    @Parameterized.Parameters
    public static int[][] data() {
        return new int[][]{{2, 3, 5, 0}, {7, 0, 22, 51, -34}};
    }

    private final int[] array;

    public SorterParameterizedTest(int[] array) {
        this.array = array;
    }

    @Test
    public void bubbleSort() {
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        bubbleSorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void quickSort() {
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        quickSorter.sort(array);
        assertArrayEquals(expected, array);
    }
}