/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_sevry;

/**
 *
 * @author 
 */
public class Epée extends Arme{
    
    int Finesse;
    
    public Epée(String name, int pc, int finesse){
        super(name, pc);
        Finesse = finesse;
    }
    
    public int get_finesse(){
        return Finesse;
    }
    
}
