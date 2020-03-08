/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author ΑΝΤΡΕΑΣ
 */
public enum Fabric {
    WOOL(1), COTTON(2),  POLYESTER(3),  RAYON(4),  LINEN(5),  CASHMERE(10),  SILK(15);
    
    public int value;
    
    private Fabric(int i){
        this.value =i;
    }
    
}
