package com.java.practice.task01.sorter;

import java.util.Arrays;

public class ArraySorterRunner {
    public static void main(String[] args) {
        ArraySorter arraySorter = new ArraySorter();
        int[] numbers = new int[]{2, 6, 8, -1, 12, 7, 4};
        arraySorter.sort(numbers, TypesSorting.BUBBLE_SORT);
        System.out.println(Arrays.toString(numbers));
    }
}
