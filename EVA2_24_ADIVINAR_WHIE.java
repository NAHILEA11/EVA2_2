/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_24_adivinar_whie;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA2_24_ADIVINAR_WHIE {

    public static void main(String[] args) {
        //TODO code application logic here
        int numero =5;//numero que tiene que adivinar entre 1 y 10)
        int valor = 0;// valor para almacenar lo que capture el usuario
        
        Scanner captu = new Scanner (System.in);
        while (numero != valor) {
            System.out.print("Cual es el numero? (entre 1 y 10)");
            valor = captu.nextInt();
        }
        System.out.println("ADIVINASTE");
    }
}
