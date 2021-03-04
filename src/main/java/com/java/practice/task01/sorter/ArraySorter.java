package com.java.practice.task01.sorter;

public class ArraySorter {
    public void sort(int[] numbers, TypesSorting typesSorting) {
        switch (typesSorting) {
            case BUBBLE_SORT:
                new BubbleSorter().sort(numbers);
                break;
            case INSERTION_SORT:
                new InsertionSorter().sort(numbers);
                break;
            case SELECTION_SORT:
                new SelectionSorter().sort(numbers);
                break;
            case MERGE_SORT:
                new MergeSorter().sort(numbers);
                break;
            case QUICK_SORT:
                new QuickSorter().sort(numbers);
                break;
        }
    }
}

