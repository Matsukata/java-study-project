package com.java.practice.task01.sorter;

import java.util.Map;

public class ArraySorter {
    private static final Map<SortType, Sort> sorterMap = Map.of(SortType.BUBBLE_SORT, new BubbleSorter(),
            SortType.INSERTION_SORT, new InsertionSorter(),
            SortType.SELECTION_SORT, new SelectionSorter(),
            SortType.MERGE_SORT, new MergeSorter(),
            SortType.QUICK_SORT, new QuickSorter());

    public static Map<SortType, Sort> getSorterMap() {
        return sorterMap;
    }

    public void sort(int[] numbers, SortType sortType) {
        sorterMap.get(sortType).sort(numbers);
    }
}
