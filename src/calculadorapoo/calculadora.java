/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorapoo;

/**
 *
 * @author Usuario
 */
class Operaciones {
    private double acumulado;

    public Operaciones() {
        this.acumulado = 0;
    }

    public double sumar(double num1, double num2) {
        double resultado = num1 + num2;
        acumulado += resultado; 
        return resultado;
    }

    public double restar(double num1, double num2) {
        double resultado = num1 - num2;
        acumulado += resultado; 
        return resultado;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }

    public double getAcumulado() {
        return acumulado;
    }
}