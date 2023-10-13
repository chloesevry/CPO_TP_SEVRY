/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.exo4;

/**
 *
 * @author bdom
 */
public class TP2Exo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          voiture uneClio = new voiture("Clio", "Renault", 5);
        voiture uneAutreClio = new voiture("Clio", "Renault", 5);
        voiture une2008 = new voiture("2008", "Peugeot", 6);
        voiture uneMicra = new voiture("Micra", "Nissan", 4);

        personne Bob = new personne("Bobby", "Sixkiller");
       personne Reno = new personne("Reno", "Raines");

        Bob.liste_voitures[0] = uneClio;
        Bob.liste_voitures[1] = uneMicra;
        Bob.liste_voitures[2] = une2008;
        Bob.nbVoitures = 3;
        uneClio.Proprietaire = Bob;
        uneMicra.Proprietaire = Bob;
        une2008.Proprietaire = Bob;

        System.out.println("liste des voitures disponibles " + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);
    

        System.out.println("la premiere voiture de Bob est " + Bob.liste_voitures[0]);
        System.out.println("la deuxième voiture de Bob est " + Bob.liste_voitures[1]); // affichage
        System.out.println("la troisième voiture de Bob est " + Bob.liste_voitures[2]);
    }

}
    
    

