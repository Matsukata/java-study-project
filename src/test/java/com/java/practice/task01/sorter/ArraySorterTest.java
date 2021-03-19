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

    private final ArraySorter arraySorter = new ArraySorter();

    @Parameterized.Parameter
    public SortType sortType;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {BUBBLE_SORT},
                {INSERTION_SORT},
                {SELECTION_SORT},
                {QUICK_SORT},
                {MERGE_SORT}
        });
    }

    @Test
    public void EmptySort() {
        int[] expected = getExpected(emptyArray);
        arraySorter.sort(emptyArray, sortType);
        assertArrayEquals(expected, emptyArray);
    }

    @Test
    public void oneElementSort() {
        int[] expected = getExpected(oneElementArray);
        arraySorter.sort(oneElementArray, sortType);
        assertArrayEquals(expected, oneElementArray);
    }

    @Test
    public void mixedNumbersArraySort() {
        int[] expected = getExpected(mixedNumbersArray);
        arraySorter.sort(mixedNumbersArray, sortType);
        assertArrayEquals(expected, mixedNumbersArray);
    }

    @Test
    public void underscoreNumbersArraySort() {
        int[] expected = getExpected(underscoreNumbersArray);
        arraySorter.sort(underscoreNumbersArray, sortType);
        assertArrayEquals(expected, underscoreNumbersArray);
    }

    @Test
    public void largeNumbersArraySort() {
        int[] expected = getExpected(largeNumbersArray);
        arraySorter.sort(largeNumbersArray, sortType);
        assertArrayEquals(expected, largeNumbersArray);
    }

    @Test
    public void zeroAndOneArraySort() {
        int[] expected = getExpected(zeroAndOneArray);
        arraySorter.sort(zeroAndOneArray, sortType);
        assertArrayEquals(expected, zeroAndOneArray);
    }

    @Test
    public void firstAndLastWrongElementArraySort() {
        int[] expected = getExpected(firstAndLastWrongElementArray);
        arraySorter.sort(firstAndLastWrongElementArray, sortType);
        assertArrayEquals(expected, firstAndLastWrongElementArray);
    }

    @Test
    public void naturalOrderSortedArraySort() {
        int[] expected = getExpected(naturalOrderSortedArray);
        arraySorter.sort(naturalOrderSortedArray, sortType);
        assertArrayEquals(expected, naturalOrderSortedArray);
    }

    @Test
    public void descendingOrderSortedArraySort() {
        int[] expected = getExpected(descendingOrderSortedArray);
        arraySorter.sort(descendingOrderSortedArray, sortType);
        assertArrayEquals(expected, descendingOrderSortedArray);
    }

    @Test
    public void negativeNumbersSortedArraySort() {
        int[] expected = getExpected(negativeNumbersSortedArray);
        arraySorter.sort(negativeNumbersSortedArray, sortType);
        assertArrayEquals(expected, negativeNumbersSortedArray);
    }

    @Test
    public void negativeNumbersDescendingOrderSortedArraySort() {
        int[] expected = getExpected(negativeNumbersDescendingOrderSortedArray);
        arraySorter.sort(negativeNumbersDescendingOrderSortedArray, sortType);
        assertArrayEquals(expected, negativeNumbersDescendingOrderSortedArray);
    }

    @Test
    public void repeatedNumbersArraySort() {
        int[] expected = getExpected(repeatedNumbersArray);
        arraySorter.sort(repeatedNumbersArray, sortType);
        assertArrayEquals(expected, repeatedNumbersArray);
    }

    private int[] getExpected(int[] array) {
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        return expected;
    }
}