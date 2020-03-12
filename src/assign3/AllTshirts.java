/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

import enums.Color;
import enums.Fabric;
import enums.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Andreas
 */
public class AllTshirts {

    private static List<Color> col = new ArrayList<>();
    private static List<Fabric> fab = new ArrayList<>();
    private static List<Size> siz = new ArrayList<>();
    private static List<Tshirt> ts = new ArrayList<>();
    private static Random rd = new Random();

    public static void printAll() {
        for (Color c : Color.values()) {
            col.add(c);

        }

        for (Fabric f : Fabric.values()) {
            fab.add(f);

        }

        for (Size s : Size.values()) {
            siz.add(s);

        }

        for (int i = 0; i < col.size(); i++) {
            for (int j = 0; j < fab.size(); j++) {
                for (int x = 0; x < siz.size(); x++) {
                    Tshirt t = new Tshirt(col.get(i), fab.get(j), siz.get(x), new PaymentCredit());
                    System.out.println(t);
                    t = new Tshirt(col.get(i), fab.get(j), siz.get(x), new PaymentCash());
                    System.out.println(t);
                    t = new Tshirt(col.get(i), fab.get(j), siz.get(x), new PaymentBank());
                    System.out.println(t);
                }

            }

        }

    }

    public static Tshirt[] RandomTshirts(int howMany) {
        Tshirt[] ats = new Tshirt[howMany];
        for (int j = 0; j < ats.length; j++) {

            ats[j] = new Tshirt(col.get(rd.nextInt(col.size())), fab.get(rd.nextInt(fab.size())), siz.get(rd.nextInt(siz.size())));

        }
        return ats;

    }

}
