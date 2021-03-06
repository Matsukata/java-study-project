package com.java.practice.task01;

import com.java.practice.task01.sorter.ArraySorter;
import com.java.practice.task01.sorter.SortType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArraySorter arraySorter = new ArraySorter();
        int[] numbers = new int[]{2, 6, 8, -1, 12, 7, 4};
        arraySorter.sort(numbers, SortType.BUBBLE_SORT);
        System.out.println(Arrays.toString(numbers));
    }
}
