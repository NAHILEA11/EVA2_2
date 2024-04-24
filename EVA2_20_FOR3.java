/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_for3;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA2_20_FOR3 {

    public static void main(String[] args) {
        //TODO code aplication logic here
        String mensaje;
        int cant;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Cual es el mensaje que quieres transmitir?");
        mensaje = captu.nextLine();
        System.out.println("Cuantas veces se va a imprimir el mensaje ?");
        cant = captu.nextInt();
        
        for (int i = 1; i <= cant; i++) {
            System.out.println(mensaje);
        }
        System.out.println("");
        //IMPRIMIR LA SUMATORIA DE UN NUMERO;
        //Solicitar numero entero, calcular la sumatoria. Ejemplo;
        //El usuario introduce un S, cacular;
        //1 + 2 + 3 + 4 + 5
        int NE;
        int suma = 0;
        
        System.out.println("Introduce un numero entero");
        NE = captu.nextInt();
        
        for (int i = 1; i <= NE; i++) {
            suma += 1;
        }
        System.out.println("La sumatoria del 1 al " + NE + "es;" + suma);
        //CAPTURA UN NUMERO E IMRPRIMIR UNA SECUENCUA DE *. EJEMPLO:
        // *. **. ***
        System.out.println("");
        int N3;
        
        Scanner scanner = new Scanner (System.in);
        // Capturar el numero ingresado por el usuario
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        
        //Imprimir la secuencia de asteriscos
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = numero; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
}
