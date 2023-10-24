/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author bdom
 */
public class Magicien extends Personnage {
    boolean confirmé;
    
    public Magicien (String n, int i, boolean a) {
        super(n, i);
        confirmé = a; 
            
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
    
        
}
