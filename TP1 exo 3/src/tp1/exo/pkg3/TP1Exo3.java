/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.exo.pkg3;

import java.util.Scanner;

/**
 *
 * @author Chloé Sevry
 */
public class TP1Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // TODO code application logic here
       

 



    
        Scanner scanner = new Scanner(System.in);

 

        System.out.println("Enter an operator:");

        System.out.println("1) Addition");

        System.out.println("2) Subtraction");

        System.out.println("3) Multiplication");

        System.out.println("4) Division");

        System.out.println("5) Modulo");

 

        int choice = scanner.nextInt();

 

        if (choice < 1 || choice > 5) {

            System.out.println("Error: Invalid choice");

            return;

        }

 

        System.out.println("Enter the first number:");

        float num1 = scanner.nextFloat();

 

        System.out.println("Enter the second number:");

        float num2 = scanner.nextFloat();

 

        float result = 0;

 

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    
                    result = num1 / num2;
                    
                } else {
                    
                    System.out.println("Error: Division by zero");
                    
                    return;
                    
                }   break;
            case 5:
                if (num2 != 0) {
                    
                    result = num1 % num2;
                    
                } else {
                    
                    System.out.println("Error: Modulo by zero");
                    
                    return;
                    
                }   break;
            default:
                break;
        }

 

        System.out.println("Result: " + result);

    }

}
    
       