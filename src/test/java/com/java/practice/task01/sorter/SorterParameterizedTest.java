package com.java.practice.task01.sorter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class SorterParameterizedTest {
    private BubbleSorter bubbleSorter = new BubbleSorter();
    private QuickSorter quickSorter = new QuickSorter();

    @Parameterized.Parameters
    public static int[][] data() {
        return new int[][]{{2, 3, 5, 0}, {7, 0, 22, 51, -34}};
    }

    private final int[] numbers;
    private int[] expected;

    public SorterParameterizedTest(int[] numbers) {
        this.numbers = numbers;
    }

    @Test
    public void bubbleSort() {
        Arrays.sort(numbers);
        expected = numbers;
        bubbleSorter.sort(numbers);
        assertArrayEquals(numbers, expected);
    }

    @Test
    public void quickSort() {
        Arrays.sort(numbers);
        expected = numbers;
        quickSorter.sort(numbers);
        assertArrayEquals(numbers, expected);
    }
}