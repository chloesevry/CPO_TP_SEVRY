/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.exo.pkg3;

/**
 *
 * @author bdom
 */
public class TP2Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        tartiflette assiette1 = new tartiflette(500);
        tartiflette assiette2 = new tartiflette(600);
        tartiflette assiette3 = assiette2;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
       
        
        Moussaka tab[] = new Moussaka[10]; 
        for (int i = 0; i < 9; i++) { 
            Moussaka a = new Moussaka(); 
            tab[i]=a; 
            System.out.println(tab[i]); 
        }
    }
 
}