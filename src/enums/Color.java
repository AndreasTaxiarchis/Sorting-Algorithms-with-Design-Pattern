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
public enum Color {
    
    RED(1), ORANGE(1), YELLOW(1), GREEN(10), BLUEI(1), INDIGO(5), VIOLET(2);
    
     public int value;
    
    private Color(int i){
        this.value =i;
    
    }
}
