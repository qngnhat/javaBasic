/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import java.util.Arrays;

/**
 *
 * @author qngnhat
 */
public class BubbleSort {

    public static void main(String[] args) {
        // This is unsorted array
        Integer[] array = new Integer[]{12, 13, 24, 10, 3, 6, 90, 70};

        // Let's sort using bubble sort
        bubbleSort(array, 0, array.length);

        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void bubbleSort(Object[] array, int fromIndex, int toIndex) {
        Object d;
        for (int i = toIndex - 1; i > fromIndex; i--) {
            boolean isSorted = true;
            for (int j = fromIndex; j < i; j++) {
                //If elements in wrong order then swap them
                if (((Comparable) array[j]).compareTo(array[j + 1]) > 0) {
                    isSorted = false;
                    d = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = d;
                }
            }
            //If no swapping then array is already sorted
            if (isSorted) {
                break;
            }
        }
    }
}
