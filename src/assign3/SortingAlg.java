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
    
}
