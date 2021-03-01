package com.java.practice.task01.util;

public class SortingMethods {
    public static void main(String[] args) {
    }

    public void bubbleSortWithFor(int[] numbers) {
        for (int i = (numbers.length - 1); i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public void bubbleSortWithWhile(int[] numbers) {
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 1; i < numbers.length - 1; i++) {
                if (numbers[i - 1] > numbers[i]) {
                    int temp = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = temp;
                    isSorted = true;
                }
            }
        }
    }

    public void insertionSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 1; i < n; ++i) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
    }

    public void selectionSort(int[] numbers) {
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

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
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

    public void mergeSort(int[] numbers, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] numbers1 = new int[mid];
        int[] numbers2 = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            numbers1[i] = numbers[i];
        }
        for (int i = mid; i < n; i++) {
            numbers2[i - mid] = numbers[i];
        }
        mergeSort(numbers1, mid);
        mergeSort(numbers2, n - mid);
        merge(numbers, numbers1, numbers2, mid, n - mid);
    }

    public void merge(int[] numbers, int[] numbers1, int[] numbers2, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (numbers1[i] <= numbers2[j]) {
                numbers[k++] = numbers1[i++];
            } else {
                numbers[k++] = numbers2[j++];
            }
        }
        while (i < left) {
            numbers[k++] = numbers1[i++];
        }
        while (j < right) {
            numbers[k++] = numbers2[j++];
        }
    }
}
