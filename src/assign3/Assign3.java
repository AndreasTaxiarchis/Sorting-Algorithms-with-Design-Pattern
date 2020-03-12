/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

import assign3.comparators.TshirtColorComparator;
import assign3.comparators.TshirtFabricComparator;
import assign3.comparators.TshirtSizeComparator;






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
        Tshirt[] sortedSAsc = SortingAlg.bubbleSort(ar , new TshirtSizeComparator() );
        show(sortedSAsc);
         

        System.out.println("Sort BubbleSort Size Desc");
         System.out.println("----------------------");
        Tshirt[] sortedSDesc = SortingAlg.bubbleSort(ar , new TshirtSizeComparator().reversed() );
        show(sortedSDesc);
        
        
        
        System.out.println("Sort BubbleSort Color Asc");
         System.out.println("----------------------");
        Tshirt[] sortedCAsc = SortingAlg.bubbleSort(ar , new TshirtColorComparator() );
         show(sortedCAsc);
         
         
       
        System.out.println("Sort BubbleSort Color Desc");
         System.out.println("----------------------");
        Tshirt[] sortedCDesc = SortingAlg.bubbleSort(ar , new TshirtColorComparator().reversed() );
         show(sortedCDesc);
       
        System.out.println("Sort BubbleSort Fabric Asc");
         System.out.println("----------------------");
        Tshirt[] sortedFAsc = SortingAlg.bubbleSort(ar , new TshirtFabricComparator() );
         show(sortedFAsc);
         
        
        System.out.println("Sort BubbleSort Fabric Desc");
         System.out.println("----------------------");
        Tshirt[] sortedFDesc = SortingAlg.bubbleSort(ar , new TshirtFabricComparator().reversed() );
         show(sortedFDesc);
    }
    
    public static void show(Tshirt[] s){
        for (int i = 0; i < s.length; i++) {
            System.out.println("Tshirt :" + "c=" + s[i].c + ", f=" + s[i].f + ", s=" + s[i].s);
            
        }
         System.out.println("----------------------");
    }

}
