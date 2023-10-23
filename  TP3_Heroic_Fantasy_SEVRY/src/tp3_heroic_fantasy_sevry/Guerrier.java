/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_sevry;

/**
 *
 * @author bdom
 */
public class Guerrier extends Personnage {
    boolean cheval;
    
    public Guerrier (String n, int i, boolean a) {
        super(n, i);
        cheval = a; 
            
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
}