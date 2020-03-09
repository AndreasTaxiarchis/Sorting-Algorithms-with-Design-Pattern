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
 * @author ΑΝΤΡΕΑΣ
 */
public class Assign3 {
    private static final Random rd = new Random();
    private static List<Color> col= new ArrayList<>();
    private static List<Fabric> fab= new ArrayList<>();
    private static List<Size> siz= new ArrayList<>();
    private static List<Tshirt> ts = new ArrayList<>();
    private static Tshirt tt;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Υλοποίηση να εκτυπώνει όλους τους δυνατούς συνδιασμούς των 3 enum με τις 
        // αντίστοιχες τιμές τους 

        
        for (Color c : Color.values()) {
            col.add(c);

        }

        
        for (Fabric f : Fabric.values()) {
            fab.add(f);

        }

        
        for (Size s : Size.values()) {
            siz.add(s);

        }
//
//        for (int i = 0; i < col.size(); i++) {
//            for (int j = 0; j < fab.size(); j++) {
//                for (int x = 0; x < siz.size(); x++) {
//                        Tshirt t = new Tshirt(col.get(i),fab.get(j),siz.get(x), new PaymentCredit() );
//                        System.out.println(t);
//                        t = new Tshirt(col.get(i),fab.get(j),siz.get(x), new PaymentCash() );
//                        System.out.println(t);
//                        t = new Tshirt(col.get(i),fab.get(j),siz.get(x), new PaymentBank()  );
//                        System.out.println(t);
//                }
//
//            }
//
//        }
        
//Eναλλακτική υλοποίηση να εκτυπώνει μόνο 3 ΤShirt με τις τιμές τους        

//        Tshirt t = new Tshirt(Color.GREEN,Fabric.POLYESTER,Size.XL, new PaymentCredit() );
//        System.out.println(t);
//        t= new Tshirt(Color.VIOLET,Fabric.COTTON,Size.M, new PaymentCash() );
//        System.out.println(t);
//        t= new Tshirt(Color.INDIGO,Fabric.WOOL,Size.L, new PaymentBank());
//        System.out.println(t);

        
        for(int i=0; i<45; i++) {
            
            ts.add(new Tshirt(cl(),fr(),sz()));

        }

        
    }
    

    public static Color cl(){
            
            return col.get(rd.nextInt(col.size()));
            
        }
    public static Fabric fr(){
            
            return fab.get(rd.nextInt(fab.size()));
            
        }
    public static Size sz(){
            
            return siz.get(rd.nextInt(siz.size()));
            
        }
    
    
    
 
    
}
    
    
    
    

    
    
    

    
    
    
