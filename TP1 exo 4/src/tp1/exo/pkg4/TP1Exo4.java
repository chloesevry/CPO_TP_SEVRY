/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.exo.pkg4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chloé Sevry
 */
public class TP1Exo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Créer un tableau de 6 entiers pour représenter les faces du dé
        int[] tableauDeDes = new int[6];

        // Demander à l'utilisateur de saisir le nombre de lancers
        System.out.print("Saisissez le nombre de lancers : ");
        int nombreDeLancers = scanner.nextInt();

        // Créer un générateur de nombres aléatoires
        Random random = new Random();

        // Effectuer les lancers et mettre à jour le tableau
        for (int i = 0; i < nombreDeLancers; i++) {
            int resultatLancer = random.nextInt(6); // Génère un nombre aléatoire entre 0 et 5
            tableauDeDes[resultatLancer]++;
        }

        // Afficher les résultats sous forme de pourcentages
        System.out.println("Résultats des lancers (en pourcentage) :");
        for (int i = 0; i < tableauDeDes.length; i++) {
            double pourcentage = (double) tableauDeDes[i] / nombreDeLancers * 100.0;
            System.out.println("Face " + (i + 1) + ": " + pourcentage + "%");
        }

        scanner.close();
    }
}
   
