/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_23_adivinar;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA2_23_ADIVINAR {

    public static void main(String[] args) {
        //TODO code application logic here
        int numero = 5;//numeron que tiene que adivinar entre 1 y 10)
        int valor = 0;// valor para almacenar lo que capture el usuario
        
        Scanner captu = new Scanner (System.in);
        do {
            System.out.println("Cual es el numero ? (entre 1 y 10");
            valor = captu.nextInt();
        }while (numero != valor);
        System.out.println("ADIVINASTE");
    }
}
