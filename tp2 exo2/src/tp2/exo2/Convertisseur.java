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
public class Convertisseur {
int nbConversions;
    public Convertisseur() {
        nbConversions = 0;
    }
        // CONVERTION CELCIUS VERS KELVIN
    public static double CelciusVersKelvin(double tCelcius) {
        double tKelvin;
        tKelvin = tCelcius + 273.15;
        return tKelvin;
    }
    // CONVERTION KELVIN VERS CELCIUS

    public static double KelvinVersCelcius(double tKelvin) {
        double tCelcius;
        tCelcius = tKelvin - 273.15;
        return tCelcius;
    }
    // CONVERTION FARENHEIT VERS CELCIUS

    public static double FarenheitVersCelcius(double tFarenheit) {
        double tCelcius;
        tCelcius = tFarenheit - 32;
        return tCelcius;
    }
    // CONVERTION CELCIUS VERS FARENHEIT

    public static double CelciusVersFarenheit(double tCelcius) {
        double tFarenheit;
        tFarenheit = tCelcius - 32;
        return tFarenheit;
    }

    // CONVERTION KELVIN VERS FARENHEIT
    public static double KelvinVersFarenheit(double tKelvin) {
        double tFarenheit;
        tFarenheit = tKelvin - 460;
        return tFarenheit;
    }

    // CONVERTION FARENHEIT VERS KELVIN
    public static double FarenheitVersKelvin(double tFarenheit) {
        double tKelvin;
        tKelvin = tFarenheit + 460;
        return tKelvin;

    }
   @Override
    public String toString () {
    return "nb de conversions"+ nbConversions;
    }
}
