/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.exo.pkg4;

/**
 *
 * @author sevry chloé 
 */
public class voiture {

    String Modele;
    String Marque;
    Personne Proprietaire;
    int PuissanceCV;
    

    public Voiture(String modele, String marque, int puissanceCV) {
        Proprietaire = null;
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = puissanceCV;
        // Proprietaire=this;

    }

    @Override
    // methode qui retourne la chaine de caractère que l’on veut afficher quand l’objet est cité
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "\n" + "Modele: " + Modele + "\n" + " Marque: " + Marque + "\n" + " PuissanceCV: " + PuissanceCV;
        return chaine_a_retourner;
    }
}
    

