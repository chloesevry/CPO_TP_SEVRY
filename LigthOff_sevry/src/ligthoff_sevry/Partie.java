/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligthoff_sevry;

import java.util.Scanner;

/**
 *
 * @author bdom
 */
public class Partie {


    private final GrilleDeJeu grille;
    private int nbCoups;

    public Partie(int nbLignes, int nbColonnes) {
        grille = new GrilleDeJeu(nbLignes, nbColonnes);
        nbCoups = 0;
    }

    /**
     *
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(500);
    }

    /**
     *
     */
    public void lancerPartie() {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Bienvenue dans LightOff !");
        initialiserPartie();

        while (!grille.cellulesToutesEteintes()) {
            System.out.println(grille.cellulesToutesEteintes());
            System.out.println(grille);
            System.out.println("Activer soit une ligne (1) soit une colonne (2) soit la diagnale montante (3) soit la diagonale descendante (4)");
            int coup = sc1.nextInt();
            if (coup == 1) {
                System.out.println("Quelle ligne ?");
                int ligne = sc1.nextInt();
                grille.activerLigneDeCellules(ligne);
            }
            if (coup == 2) {
                System.out.println("Quelle colonne ?");
                int ligne = sc1.nextInt();
                grille.activerColonneDeCellules(ligne);

            }
            if (coup == 3) {

                grille.activerDiagonaleMontante();

            }
            if (coup == 4) {

                grille.activerDiagonaleDescendante();

            }

            nbCoups++;
        }

        System.out.println(grille);
        System.out.println("Bravo ! Vous avez eteint toutes les cellules en " + nbCoups + " coups.");
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Partie partie = new Partie(7, 7);
        partie.lancerPartie();
    }

}
    

