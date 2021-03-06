package com.java.practice.task01.sorter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArraySorter {
    private static final Map<SortType, Sort> arraySorterMap;
    private static final Map<SortType, Sort> sorterMap;

    static {
        arraySorterMap = new HashMap<>();
        arraySorterMap.put(SortType.BUBBLE_SORT, new BubbleSorter());
        arraySorterMap.put(SortType.INSERTION_SORT, new InsertionSorter());
        arraySorterMap.put(SortType.SELECTION_SORT, new SelectionSorter());
        arraySorterMap.put(SortType.MERGE_SORT, new MergeSorter());
        arraySorterMap.put(SortType.QUICK_SORT, new QuickSorter());
        sorterMap = Collections.unmodifiableMap(arraySorterMap);
    }

    public void sort(int[] numbers, SortType sortType) {
        sorterMap.get(sortType).sort(numbers);
    }
}
