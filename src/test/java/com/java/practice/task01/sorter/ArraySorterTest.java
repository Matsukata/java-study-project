package com.java.practice.task01.sorter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.java.practice.task01.sorter.SortType.BUBBLE_SORT;
import static com.java.practice.task01.sorter.SortType.INSERTION_SORT;
import static com.java.practice.task01.sorter.SortType.MERGE_SORT;
import static com.java.practice.task01.sorter.SortType.QUICK_SORT;
import static com.java.practice.task01.sorter.SortType.SELECTION_SORT;
import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class ArraySorterTest {
    private final int[] emptyArray = new int[]{};
    private final int[] oneElementArray = new int[]{1};
    private final int[] mixedNumbersArray = new int[]{2, 4, -10, 3, -40, 2, 100};
    private final int[] underscoreNumbersArray = new int[]{-55, 12, -56, 1, -49, 1, 1_000, -1000, 0, 59};
    private final int[] largeNumbersArray = new int[]{-456, 100_000_000, -50000, 100, 5679, -10654, 2, -2, 0, 59};
    private final int[] zeroAndOneArray = new int[]{0, 0, 0, 1, 0, 0, 0};
    private final int[] firstAndLastWrongElementArray = new int[]{1, 9, 8, 7, 5, 3, 1};
    private final int[] naturalOrderSortedArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private final int[] descendingOrderSortedArray = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    private final int[] negativeNumbersSortedArray = new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9};
    private final int[] negativeNumbersDescendingOrderSortedArray = new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1};
    private final int[] repeatedNumbersArray = new int[]{-10, -4, -10, -3, -40, -2, -100};

    @Parameterized.Parameter
    public Sort sort;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {ArraySorter.getSorterMap().get(BUBBLE_SORT)},
                {ArraySorter.getSorterMap().get(INSERTION_SORT)},
                {ArraySorter.getSorterMap().get(SELECTION_SORT)},
                {ArraySorter.getSorterMap().get(QUICK_SORT)},
                {ArraySorter.getSorterMap().get(MERGE_SORT)}
        });
    }

    private int[] getExpected(int[] array) {
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        return expected;
    }

    @Test
    public void EmptySort() {
        int[] expected = getExpected(emptyArray);
        sort.sort(emptyArray);
        assertArrayEquals(expected, emptyArray);
    }

    @Test
    public void oneElementSort() {
        int[] expected = getExpected(oneElementArray);
        sort.sort(oneElementArray);
        assertArrayEquals(expected, oneElementArray);
    }

    @Test
    public void mixedNumbersArraySort() {
        int[] expected = getExpected(mixedNumbersArray);
        sort.sort(mixedNumbersArray);
        assertArrayEquals(expected, mixedNumbersArray);
    }

    @Test
    public void underscoreNumbersArraySort() {
        int[] expected = getExpected(underscoreNumbersArray);
        sort.sort(underscoreNumbersArray);
        assertArrayEquals(expected, underscoreNumbersArray);
    }

    @Test
    public void largeNumbersArraySort() {
        int[] expected = getExpected(largeNumbersArray);
        sort.sort(largeNumbersArray);
        assertArrayEquals(expected, largeNumbersArray);
    }

    @Test
    public void zeroAndOneArraySort() {
        int[] expected = getExpected(zeroAndOneArray);
        sort.sort(zeroAndOneArray);
        assertArrayEquals(expected, zeroAndOneArray);
    }

    @Test
    public void firstAndLastWrongElementArraySort() {
        int[] expected = getExpected(firstAndLastWrongElementArray);
        sort.sort(firstAndLastWrongElementArray);
        assertArrayEquals(expected, firstAndLastWrongElementArray);
    }

    @Test
    public void naturalOrderSortedArraySort() {
        int[] expected = getExpected(naturalOrderSortedArray);
        sort.sort(naturalOrderSortedArray);
        assertArrayEquals(expected, naturalOrderSortedArray);
    }

    @Test
    public void descendingOrderSortedArraySort() {
        int[] expected = getExpected(descendingOrderSortedArray);
        sort.sort(descendingOrderSortedArray);
        assertArrayEquals(expected, descendingOrderSortedArray);
    }

    @Test
    public void negativeNumbersSortedArraySort() {
        int[] expected = getExpected(negativeNumbersSortedArray);
        sort.sort(negativeNumbersSortedArray);
        assertArrayEquals(expected, negativeNumbersSortedArray);
    }

    @Test
    public void negativeNumbersDescendingOrderSortedArraySort() {
        int[] expected = getExpected(negativeNumbersDescendingOrderSortedArray);
        sort.sort(negativeNumbersDescendingOrderSortedArray);
        assertArrayEquals(expected, negativeNumbersDescendingOrderSortedArray);
    }

    @Test
    public void repeatedNumbersArraySort() {
        int[] expected = getExpected(repeatedNumbersArray);
        sort.sort(repeatedNumbersArray);
        assertArrayEquals(expected, repeatedNumbersArray);
    }
}