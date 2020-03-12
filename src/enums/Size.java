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
public enum Size {

    
    

XS(2), S(3),M(4),L(5), XL(6), XXL(8), XXXL(10);
    
    public int value;
    
    private Size(int i){
        this.value =i;
    }
    
}
