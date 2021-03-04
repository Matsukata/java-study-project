package com.java.practice.task01.sorter;

public class SelectionSorter implements SortInt {
    @Override
    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minElementIndex] > numbers[j]) {
                    minElementIndex = j;
                }
            }
            if (minElementIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minElementIndex];
                numbers[minElementIndex] = temp;
            }
        }
    }
}
