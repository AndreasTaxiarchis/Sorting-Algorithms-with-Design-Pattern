/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

import assign3.comparators.TshirtColorComparator;
import assign3.comparators.TshirtFabricComparator;
import assign3.comparators.TshirtSizeComparator;
import assign3.comparators.TshirtiSizeColorFAbricComparator;

/**
 *
 * @author ΑΝΤΡΕΑΣ
 */
public class Assign3 {

    private static Tshirt tt;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AllTshirts.printAll();
        System.out.println("----------------------");
        Tshirt[] ar = AllTshirts.RandomTshirts(45);
        show(ar);

        System.out.println("Sort BubbleSort Size Asc");
        System.out.println("----------------------");
        Tshirt[] sortedSAsc = SortingAlg.bubbleSort(ar, new TshirtSizeComparator());
        show(sortedSAsc);

        System.out.println("Sort BubbleSort Size Desc");
        System.out.println("----------------------");
        Tshirt[] sortedSDesc = SortingAlg.bubbleSort(ar, new TshirtSizeComparator().reversed());
        show(sortedSDesc);

        System.out.println("Sort BubbleSort Color Asc");
        System.out.println("----------------------");
        Tshirt[] sortedCAsc = SortingAlg.bubbleSort(ar, new TshirtColorComparator());
        show(sortedCAsc);

        System.out.println("Sort BubbleSort Color Desc");
        System.out.println("----------------------");
        Tshirt[] sortedCDesc = SortingAlg.bubbleSort(ar, new TshirtColorComparator().reversed());
        show(sortedCDesc);

        System.out.println("Sort BubbleSort Fabric Asc");
        System.out.println("----------------------");
        Tshirt[] sortedFAsc = SortingAlg.bubbleSort(ar, new TshirtFabricComparator());
        show(sortedFAsc);

        System.out.println("Sort BubbleSort Fabric Desc");
        System.out.println("----------------------");
        Tshirt[] sortedFDesc = SortingAlg.bubbleSort(ar, new TshirtFabricComparator().reversed());
        show(sortedFDesc);

        System.out.println("Sort BubbleSort Size , Color , Fabric Asc");
        System.out.println("----------------------");
        Tshirt[] sortedSCFAsc = SortingAlg.bubbleSort(ar, new TshirtiSizeColorFAbricComparator());
        show(sortedSCFAsc);

        System.out.println("Sort BubbleSort Size , Color , Fabric Desc");
        System.out.println("----------------------");
        Tshirt[] sortedSCFDesc = SortingAlg.bubbleSort(ar, new TshirtiSizeColorFAbricComparator().reversed());
        show(sortedSCFDesc);

        System.out.println("Sort Quicksort Size Asc");
        System.out.println("----------------------");
        Tshirt[] QsortedSAsc = SortingAlg.quickSort(ar, 0, 9, new TshirtSizeComparator());
        show(QsortedSAsc);

        System.out.println("Sort Quicksort Size Desc");
        System.out.println("----------------------");
        Tshirt[] QsortedSDesc = SortingAlg.quickSort(ar, 0, 9, new TshirtSizeComparator().reversed());
        show(QsortedSDesc);

        System.out.println("Sort Quicksort Color Asc");
        System.out.println("----------------------");
        Tshirt[] QsortedCAsc = SortingAlg.quickSort(ar, 0, 9, new TshirtColorComparator());
        show(QsortedCAsc);

        System.out.println("Sort Quicksort Color Desc");
        System.out.println("----------------------");
        Tshirt[] QsortedCDesc = SortingAlg.quickSort(ar, 0, 9, new TshirtColorComparator().reversed());
        show(QsortedCDesc);

        System.out.println("Sort Quicksort Fabric Asc");
        System.out.println("----------------------");
        Tshirt[] QsortedFAsc = SortingAlg.quickSort(ar, 0, 9, new TshirtFabricComparator());
        show(QsortedFAsc);

        System.out.println("Sort Quicksort Fabric Desc");
        System.out.println("----------------------");
        Tshirt[] QsortedFDesc = SortingAlg.quickSort(ar, 0, 9, new TshirtFabricComparator().reversed());
        show(QsortedFDesc);

        System.out.println("Sort Quicksort Size , Color , Fabric Asc");
        System.out.println("----------------------");
        Tshirt[] QsortedSCFAsc = SortingAlg.quickSort(ar, 0, 9, new TshirtiSizeColorFAbricComparator());
        show(QsortedSCFAsc);

        System.out.println("Sort Quicksort Size , Color , Fabric Desc");
        System.out.println("----------------------");
        Tshirt[] QsortedSCFDesc = SortingAlg.quickSort(ar, 0, 9, new TshirtiSizeColorFAbricComparator().reversed());
        show(QsortedSCFDesc);

    }

    public static void show(Tshirt[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println("Tshirt :" + "c=" + s[i].c + ", f=" + s[i].f + ", s=" + s[i].s);

        }
        System.out.println("----------------------");
    }

}
