/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_operadores;

/**
 *
 * @author nahilea
 */
public class EVA2_1_OPERADORES {

    public static void main(String[] args) {
        //TODO code application logic here
        //OPERADORES ARITMETICOS
        //SUMA +, RESTA -, MULTIPLICACION *, DIVISION
        
        int num1, num2;
        num1 = 5;
        num2 = 3;
        int suma = num1 + num2; //operador de suma +
        //Si en el operador + uno de los terminos es 
        //una cadena,todo se convierte a cadena y se unen
        //concatenacion: union de cadenas de texto
        System.out.println("La suma es " + suma);
        boolean prueba = true;
        System.out.println("El valor de prueba es "+ prueba);
        //MULTIPLICACION *
        int multi;
        multi = num1 * num2;
        System.out.println("La multiplicacion es" + multi);
        //DIVISION /
        int divi = 7 / 2;
        System.out.println("La division es de 7 / 2 es " + divi);
        double diviDouble = 7 / 2.0; 
        System.out.println("La division (double) de 7 / 2 es" + diviDouble);
        //ACUMULADORES
        //SUMA +=, RESTA -=, MULTI *=, DIVI /=
        int sumatoria = 0;
        sumatoria = sumatoria + 90;
        sumatoria = sumatoria + 80;
        sumatoria = sumatoria + 80;
        sumatoria += 90;
        sumatoria += 80;
        sumatoria += 80;
        System.out.println("La sumatoria es " + sumatoria);
        sumatoria -= 70;//le resto 70 a sumatoria
        System.out.println("La sumatoria es " + sumatoria);
        //
        int multiAcum = 1;
        multiAcum *= 100;
        System.out.println("Multiacum  = " + multiAcum);
        multiAcum *= 5;
        System.out.println("Multiacum = " + multiAcum);
        
        
        
    }
}
