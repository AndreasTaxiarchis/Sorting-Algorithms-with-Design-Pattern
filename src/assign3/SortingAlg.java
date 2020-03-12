/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

import java.util.Comparator;

/**
 *
 * @author Andreas
 */
public class SortingAlg {

    public static Tshirt[] bubbleSort(Tshirt[] arraytosort, Comparator comparator) {
        int n = arraytosort.length;
        Tshirt temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (comparator.compare(arraytosort[j - 1], arraytosort[j]) > 0) {
                    //swap elements
                    temp = arraytosort[j - 1];
                    arraytosort[j - 1] = arraytosort[j];
                    arraytosort[j] = temp;
                }
            }
        }
        return arraytosort;
    }

    public static Tshirt[] quickSort(Tshirt[] array, int begin, int end, Comparator comparator) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end, comparator);
            quickSort(array, begin, partitionIndex - 1, comparator);
            quickSort(array, partitionIndex + 1, end, comparator);
        }
        return array;
    }

    private static int partition(Tshirt arr[], int begin, int end, Comparator comparator) {
        Tshirt pivot = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (comparator.compare(arr[j], pivot) < 0) {
                i++;
                Tshirt swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        Tshirt swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }

}
