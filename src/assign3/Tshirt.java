/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

import enums.Color;
import enums.Fabric;
import enums.Size;

/**
 *
 * @author ΑΝΤΡΕΑΣ
 */
public class Tshirt {

    public Color c;
    public Fabric f;
    public Size s;
    public Strategy strategy;

    public Tshirt(Color c, Fabric f, Size s, Strategy strategy) {
        this.c = c;
        this.f = f;
        this.s = s;
        this.strategy = strategy;

    }

    public Tshirt(Color c, Fabric f, Size s) {
        this.c = c;
        this.f = f;
        this.s = s;
    }

    
    
    public String executeStrategy(){
        return strategy.Payment();
        
    }


    @Override
    public String toString() {
        return "Tshirt :" + "c=" + c + ", f=" + f + ", s=" + s + ", payment method: " + executeStrategy()+ ", price: "+(c.value+f.value+s.value)+'}';
    }


    
    

}
