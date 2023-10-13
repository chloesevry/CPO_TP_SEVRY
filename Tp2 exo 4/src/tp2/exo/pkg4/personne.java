/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.exo.pkg4;

/**
 *
 * @author sevry chloé
 */
public class personne {
// création des variables 

    String prenom;
    String nom;
    
    Voiture[] liste_voitures;
    int nbVoitures;
     

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        liste_voitures = new Voiture[3]; // création d'un tableau 3 cases (car 3 voitures max)

    }
 public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
     boolean x = true;
     if (nbVoitures == 3){
         x = false;
     }
     if (voiture_a_ajouter.Proprietaire != null){
         x = false;
     }
     liste_voitures[nbVoitures] = voiture_a_ajouter;
     nbVoitures ++;
     voiture_a_ajouter.Proprietaire = this ;
     return x;
    }

}
    
