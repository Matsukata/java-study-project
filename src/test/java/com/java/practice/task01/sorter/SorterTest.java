package com.java.practice.task01.sorter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SorterTest {
    private static final List<int[]> testArrays = buildTestArrays();

    @Parameterized.Parameter
    public Sort sorter;

    @Parameterized.Parameter(1)
    public List<int[]> arrays;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new BubbleSorter(), testArrays},
                {new QuickSorter(), testArrays},
                {new SelectionSorter(), testArrays},
                {new MergeSorter(), testArrays},
                {new InsertionSorter(), testArrays}
        });
    }

    @Test
    public void sort() {
        arrays.stream()
                .map(this::mapArrayToEqualResult)
                .forEach(Assert::assertTrue);
    }

    private boolean mapArrayToEqualResult(int[] array) {
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        sorter.sort(array);
        return Arrays.equals(expected, array);
    }

    private static List<int[]> buildTestArrays() {
        return List.of(new int[]{},
                new int[]{1},
                new int[]{2, 4, -10, 3, -40, 2, 100},
                new int[]{-55, 12, -56, 1, -49, 1, 1_000, -1000, 0, 59},
                new int[]{-456, 100_000_000, -50000, 100, 5679, -10654, 2, -2, 0, 59},
                new int[]{0, 0, 0, 1, 0, 0, 0},
                new int[]{1, 9, 8, 7, 5, 3, 1},
                new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9},
                new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1},
                new int[]{-10, -4, -10, -3, -40, -2, -100});
    }
}
