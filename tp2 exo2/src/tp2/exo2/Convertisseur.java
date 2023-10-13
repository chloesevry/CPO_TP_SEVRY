/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.exo2;

import java.util.Scanner;

/**
 *
 * @author bdom
 */
class Convertisseur {   public static void main(String[] args) {
          
        Convertisseur a = new Convertisseur();
        /*
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("1) CelciusVersKelvin");

        System.out.println("2) KelvinVersCelcius");

        System.out.println("3) FarenheitVersCelcius");

        System.out.println("4) CelciusVersFarenheit");

        System.out.println("5) KelvinVersFarenheit");

        System.out.println("6) FarenheitVersKelvin");

        System.out.println(" Bonjour, quelle conversion voulez-vous faire ?");

        int nb1 = sc.nextInt();

        while (nb1 > 6 || nb1 < 1) {

            System.out.println("ERREUR La valeur n'est pas comprise entre 1 et 6");

            System.out.println("\n Entrer un nombre :");

            nb1 = sc.nextInt(); 

        }

        System.out.println(" Bonjour, quelle température ?");

        double temp = sc.nextDouble();

        switch (nb1) {

            case 1 -> {
               
                System.out.println("La température en Kelvin est : " + a.CelciusVersKelvin(temp));

            }

            case 2 -> {
           
                System.out.println("La température en Celcius est : " + a.KelvinVersCelcius(temp));

            }

            case 3 -> {
              
                System.out.println("La température en Celcius est : " + a.FarenheitVersCelcius(temp));

            }

            case 4 -> {
             
                System.out.println("La température en Fareinheit est : " + a.CelciusVersFarenheit(temp));

            }

            case 5 -> {

                 System.out.println("La température en Fareinheit est : " + a.KelvinVersFarenheit(temp));

            }

            case 6 -> {
                 System.out.println("La température en Kelvin est : " + a.FarenheitVersKelvin(temp));

            }

 

        }

 

    }

    String FarenheitVersKelvin(double temp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String CelciusVersKelvin(double temp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
        
    
    


    

