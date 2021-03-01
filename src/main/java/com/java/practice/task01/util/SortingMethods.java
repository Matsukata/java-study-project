package com.java.practice.task01.util;

import java.util.Arrays;

public class SortingMethods {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 6, 3, 9};
        System.out.println(Arrays.toString(new SortingMethods().bubbleSortWithFor(numbers)));
        System.out.println(Arrays.toString(new SortingMethods().bubbleSortWithWhile(numbers)));
        System.out.println(Arrays.toString(new SortingMethods().insertionSort(numbers)));
        System.out.println(Arrays.toString(new SortingMethods().selectionSort(numbers)));
        System.out.println(Arrays.toString(new SortingMethods().quickSort(numbers,0,numbers.length-1)));
        System.out.println(Arrays.toString(new SortingMethods().mergeSort(numbers)));
    }

    private int[] bubbleSortWithFor(int[] numbers) {
        for (int i = (numbers.length - 1); i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    private int[] bubbleSortWithWhile(int[] numbers) {
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
        return numbers;
    }

    private int[] insertionSort(int[] numbers) {
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
        return numbers;
    }

    private int[] selectionSort(int[] numbers) {
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
        return numbers;
    }

    private int[] quickSort(int[] numbers, int from, int to) {
        if (from < to) {
            int divideIndex = partition(numbers, from, to);
            quickSort(numbers, from, divideIndex - 1);
            quickSort(numbers, divideIndex, to);
        }
        return numbers;
    }

    private static int partition(int[] numbers, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;
        int pivot = numbers[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {
            while (numbers[leftIndex] < pivot) {
                leftIndex++;
            }
            while (numbers[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(numbers, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private int[] mergeSort(int[] numbers) {
        int[] tmp;
        int[] currentSrc = numbers;
        int[] currentDest = new int[numbers.length];
        int size = 1;
        while (size < numbers.length) {
            for (int i = 0; i < numbers.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }
            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;
            size = size * 2;
        }
        return currentSrc;
    }

    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest, int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;
        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);
        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }
}
