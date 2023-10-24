/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author chloé Sevr
 */
public abstract class Arme {
    
    protected String Name;
    protected int Pc;
    protected String Type = this.getClass().getSimpleName();
    protected int nb_armes = 0; 
    
            
    public Arme(String name, int pc){
        Name = name;
        Pc = pc;
        nb_armes ++;
    }
    
    @Override
    public String toString(){
        return "Name : " + Name + " Pc : " + Pc;
    }
    
    public String get_name(){
        return Name;
    }
    
    public String get_type(){
        return Type;
    }
    
    public void finalize() {
        if (nb_armes > 0){
            nb_armes --;
        }else{
            System.out.println("Impossible de supprimer ce personnage");
        }
    }
    
    public int get_pc(){
        return Pc;
    }
    
}