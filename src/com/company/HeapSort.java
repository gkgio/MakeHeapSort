package com.company;

/**
 * Created by Георгий on 15.09.2016.
 */
public class HeapSort {

    public int[] myHeapSort(int[] array) {
        int arrayLength = array.length;
        int position;
        //first stem in HeapSort algorithm
        for (int i = arrayLength / 2 - 1; i >= 0; i--) {
            position = drop(array, i, arrayLength);
            if (position == -1) continue;
            while (arrayLength - 1 >= position * 2 + 1) {
                position = drop(array, position, arrayLength);
                if (position == -1) break;
            }
        }
        //second stem in HeapSort algorithm
        while (arrayLength > 1) {
            swap(array,0,arrayLength - 1);
            arrayLength--;
            position = drop(array, 0, arrayLength);
            if (position == -1) continue;
            while (arrayLength > position * 2 + 1) {
                position = drop(array, position, arrayLength);
                if (position == -1) break;
            }
        }
        return array;
    }

    private int drop(int[] array, int i, int arrayLength) {
        if(arrayLength==1)return -1;
        if (arrayLength - 1 < i * 2 + 2) {
            if (array[i] > array[i * 2 + 1]) {
                swap(array,i,i*2+1);
                return i * 2 + 1;
            }
        } else {
            if (array[i * 2 + 1] < array[i * 2 + 2]) {
                if (array[i] > array[i * 2 + 1]) {
                    swap(array,i,i*2+1);
                    return i * 2 + 1;
                }
            }
            else if(array[i]>array[i*2+2]){
                swap(array,i,i*2+2);
                return i * 2 + 2;
            }
        }
        return -1;
    }

    private void swap(int[] array, int left, int right){
        if(left!=right){
            int tmp=array[right];
            array[right]=array[left];
            array[left]=tmp;
        }
    }
}
