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
public class TshirtSizeComparator implements Comparator<Tshirt> {

    @Override
    public int compare(Tshirt o1, Tshirt o2) {
        return (o1.s.ordinal() - o2.s.ordinal());
    }

    @Override
    public Comparator<Tshirt> reversed() {
        return Comparator.super.reversed();
    }

}
