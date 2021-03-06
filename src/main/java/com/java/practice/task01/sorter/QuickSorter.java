package com.java.practice.task01.sorter;

public class QuickSorter implements Sort {
    @Override
    public void sort(int[] numbers) {
        quickSort(numbers, numbers[0], numbers[numbers.length]);
    }

    private void quickSort(int[] numbers, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(numbers, begin, end);
            quickSort(numbers, begin, partitionIndex - 1);
            quickSort(numbers, partitionIndex + 1, end);
        }
    }

    private int partition(int[] numbers, int begin, int end) {
        int pivot = numbers[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (numbers[j] <= pivot) {
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[end];
        numbers[end] = temp;
        return i + 1;
    }
}
