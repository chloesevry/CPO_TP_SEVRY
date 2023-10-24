/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_sevry;
import Armes.Baton;
import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
import Armes.Arme;
import Armes.Epée;
import java.util.ArrayList;

/**
 *
 * @author Chloé Sevry
 */
public class TP3_Heroic_Fantasy_SEVRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arme Epee1 = new Epée("Excalibur", 7, 5);
        Arme Epee2 = new Epée("Durandal", 4, 7);
        Arme bat1 = new Baton("Chêne", 4, 5);
        Arme bat2 = new Baton("Charme", 5, 6);


// ...

ArrayList<Arme> tabArmes = new ArrayList<Arme>();
tabArmes.add(Epee1);
tabArmes.add(Epee2);
tabArmes.add(bat1);
tabArmes.add(bat2);

for (int i = 0; i < tabArmes.size(); i++) {
    System.out.println(tabArmes.get(i));
}

        Personnage Magicien1 = new Magicien("Gandalf", 65, true);
        Personnage Magicien2 = new Magicien("Garcimore", 44, false);
        Personnage Guerrier1 = new Guerrier("Conan", 78, false);
        Personnage Guerrier2 = new Guerrier("Lannister", 45, true);

ArrayList<Personnage> tabPerso = new ArrayList<Personnage>();
tabPerso.add(Magicien1);
tabPerso.add(Magicien2);
tabPerso.add(Guerrier1);
tabPerso.add(Guerrier2);

for (int i = 0; i < tabPerso.size(); i++) {
    System.out.println(tabPerso.get(i));
}
    }
}


    
