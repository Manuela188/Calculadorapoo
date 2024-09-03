/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorapoo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadorapoo {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion = "";

        Operaciones operaciones = new Operaciones(); 

        while (!opcion.equals("5")) {
            System.out.println("1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir");
            opcion = entrada.nextLine();

            if (opcion.equals("5")) {
                System.out.println("Saliendo del programa.");
                break;
            }

            System.out.println("Ingrese el número 1:");
            double numero1 = entrada.nextDouble();
            System.out.println("Ingrese el número 2:");
            double numero2 = entrada.nextDouble();

            double resultado = 0;

            switch (opcion) {
                case "1":
                    resultado = operaciones.sumar(numero1, numero2);
                    break;
                case "2":
                    resultado = operaciones.restar(numero1, numero2);
                    break;
                case "3":
                    resultado = operaciones.multiplicar(numero1, numero2);
                    break;
                case "4":
                    resultado = operaciones.dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);
            entrada.nextLine(); 
        }
    }
}

