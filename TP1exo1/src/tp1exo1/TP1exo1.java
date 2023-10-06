/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1exo1;

import java.util.Scanner;

/**
 *
 * @author bdom
 */
public class TP1exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Entrez le premier entier : ");
            int premierEntier = scanner.nextInt();
            System.out.print("Entrez le deuxième entier : ");
            int deuxiemeEntier = scanner.nextInt();
            
            System.out.println("Vous avez saisi :");
            System.out.println("Premier entier : " + premierEntier);
            System.out.println("Deuxième entier : " + deuxiemeEntier);
           
            int somme = premierEntier + deuxiemeEntier;
            int difference = premierEntier - deuxiemeEntier;
            int produit = premierEntier * deuxiemeEntier;
            int quotient = premierEntier / deuxiemeEntier;
            int reste = premierEntier % deuxiemeEntier;
          
            System.out.println("Résultats des calculs :");
            System.out.println("Somme : " + somme);
            System.out.println("Différence : " + difference);
            System.out.println("Produit : " + produit);
            System.out.println("Quotient : " + quotient);
            System.out.println("Reste de la division : " + reste);
           
        }
    }
}
  