package com.java.practice.task01.util;

public class SortUtil {
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
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i + 1] < numbers[i]) {
                    int temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    isSorted = true;
                }
            }
        }
    }

    public void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
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

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public void quickSort(int[] numbers, int begin, int end) {
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

    public void mergeSort(int[] array) {
        mergeSort(array, array.length);
    }

    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }

    private void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
