/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_sevry;

import java.util.ArrayList;

/**
 *
 * @author chloé Sevry
 */
public class TP3_Heroic_Fantasy_SEVRY {

      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Epée Exca = new Epée("Excalibur", 7, 5);
        Epée Dura = new Epée("Durandal", 4, 7);
        
        Baton Che = new Baton("Chêne", 4, 7);
        Baton Cha = new Baton("Charme", 5, 6);
        
        ArrayList<Arme> recapArme = new ArrayList();
        recapArme.add(Exca);
        recapArme.add(Dura);
        recapArme.add(Cha);
        recapArme.add(Che);
        
        
        int tailleArme;
        tailleArme = recapArme.size();
        //tailleArme = tailleArme-1;
        
        for (int i=0;i<tailleArme;i++) {
            
            System.out.println(recapArme.get(i));
            
        }
        Magicien = new Magicien ("Masdak", 50, true)
        Magicien  = new Magicien ("Dumbledore", 15, false)
                
        Guerrier John = new Guerrier ("John Snow", 60, true)
        Guerrier Ary = new Guerrier ("Arya Stark",20, false)
                
        
    }
    
}