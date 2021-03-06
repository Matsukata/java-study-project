package com.java.practice.task01.sorter;

public class BubbleSorter implements Sort {
    @Override
    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int currentMin = numbers[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < currentMin) {
                    currentMin = numbers[j];
                    currentMinIndex = j;
                }
            }
            if (currentMin < numbers[i]) {
                int temp = numbers[i];
                numbers[i] = currentMin;
                numbers[currentMinIndex] = temp;
            }
        }
    }
}
