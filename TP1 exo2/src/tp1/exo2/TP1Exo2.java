/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.exo2;

import java.util.Scanner;

/**
 *
 * @author chloé Sevry
 */
public class TP1Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Saisissez une valeur de température en degrés Celsius : ");
            double temperatureCelsius = scanner.nextDouble();
            
            System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
            System.out.println("1) De Celsius vers Kelvin");
            System.out.println("2) De Kelvin vers Celsius");
            System.out.println("3) De Fahrenheit vers Celsius");
            System.out.println("4) De Celsius vers Fahrenheit");
            System.out.println("5) De Fahrenheit vers Kelvin");
            int choix = scanner.nextInt();
            
            double resultat = 0.0;
            
            switch (choix) {
                case 1:
                    resultat = CelciusVersKelvin(temperatureCelsius);
                    System.out.println(temperatureCelsius + " degrés Celsius sont équivalents à " + resultat + " degrés Kelvin.");
                    break;
                case 2:
                    resultat = KelvinVersCelcius(temperatureCelsius);
                    System.out.println(temperatureCelsius + " degrés Kelvin sont équivalents à " + resultat + " degrés Celsius.");
                    break;
                case 3:
                    resultat = FarenheitVersCelcius(temperatureCelsius);
                    System.out.println(temperatureCelsius + " degrés Fahrenheit sont équivalents à " + resultat + " degrés Celsius.");
                    break;
                case 4:
                    resultat = CelciusVersFarenheit(temperatureCelsius);
                    System.out.println(temperatureCelsius + " degrés Celsius sont équivalents à " + resultat + " degrés Fahrenheit.");
                    break;
                case 5:
                    resultat = FarenheitVersKelvin(temperatureCelsius);
                    System.out.println(temperatureCelsius + " degrés Fahrenheit sont équivalents à " + resultat + " degrés Kelvin.");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }

    public static double CelciusVersKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32.0) * 5.0 / 9.0;
    }

    public static double CelciusVersFarenheit(double tCelsius) {
        return (tCelsius * 9.0 / 5.0) + 32.0;
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        double tCelsius = FarenheitVersCelcius(tFarenheit);
        return CelciusVersKelvin(tCelsius);
    }
}
   
