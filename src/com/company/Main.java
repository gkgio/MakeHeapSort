package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //make array and add 20 random elements and print it
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(200) + 1;

        }
        System.out.println();
        HeapSort heapSort = new HeapSort();
        array = heapSort.myHeapSort(array);
        //print array after used HeapSort
        for (int i = 0; i < 20; i++) {
            System.out.print(String.format("%d  ",array[i]));
        }
    }
}
