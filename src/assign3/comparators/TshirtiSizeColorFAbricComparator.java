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
 * @author ΑΝΤΡΕΑΣ
 */
public class TshirtiSizeColorFAbricComparator implements Comparator<Tshirt> {

    @Override
    public int compare(Tshirt o1, Tshirt o2) {
        int comparison = o1.s.ordinal() - o2.s.ordinal();
        if (comparison == 0) {
            Comparator.super.thenComparing(Comparator.comparing(Tshirt::getC));
        }
        if (comparison > 0) {
            return 1;
        }

        return -1;
    }

    @Override
    public Comparator<Tshirt> reversed() {
        return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
    }

    public int thenComparing(Tshirt o1, Tshirt o2) {

        int comparison = o1.c.name().compareTo(o2.c.name());
        if (comparison == 0) {
            Comparator.super.thenComparing(Comparator.comparing(Tshirt::getF));
        }
        if (comparison > 0) {
            return 1;
        }

        return -1;

    }

}
