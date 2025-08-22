package com.mc.algorism.f_bruteforce;

import com.mc.util.SortUtil;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = SortUtil.createRandom(10);
        SortUtil.checkTime(() ->{
            selectionSort(arr);
            System.out.println(Arrays.toString(arr));
        });
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = indexOfMain(arr, i);
            SortUtil.swap(arr, i, minIndex);

        }
    }

    private static int indexOfMain(int[] arr, int porinter) {
        int min = porinter;
        for (int i = porinter; i < arr.length; i++) {
            if(arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }

}
