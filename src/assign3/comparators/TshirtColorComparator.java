/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3.comparators;

import assign3.Tshirt;
import java.util.Comparator;

/**
 *
 * @author Andreas
 */
public class TshirtColorComparator implements Comparator<Tshirt>{

    @Override
    public int compare(Tshirt o1, Tshirt o2) {
        int comparison = o1.c.name().compareTo(o2.c.name());
        if (comparison<0) return -1;
        if (comparison>0) return 1;
        
        return 0;
    }
    
     @Override
    public Comparator<Tshirt> reversed() {
        return Comparator.super.reversed();
    }
    
}
