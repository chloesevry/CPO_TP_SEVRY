/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_sevry;

/**
 *
 * @author bdom
 */
public class Personnage {
    
    String nom;
    int vie;
        
    public Personnage(String n, int i){
        nom=n;
        vie=i;
    }
     
    @Override
    public String toString() {
        String outil;
        outil = "Nom du perso : "+nom+"\nNiveau de vie : "+vie;
        return outil;
                
    }
    
    
    
}
