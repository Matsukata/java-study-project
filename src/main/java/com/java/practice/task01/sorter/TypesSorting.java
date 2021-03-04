package com.java.practice.task01.sorter;

public enum TypesSorting {
    BUBBLE_SORT("bubble sort"),
    INSERTION_SORT("insertion sort"),
    SELECTION_SORT("selection sort"),
    MERGE_SORT("merge sort"),
    QUICK_SORT("quick sort");

    private String sortMethod;

    TypesSorting(String sortMethod) {
        this.sortMethod = sortMethod;
    }
}
