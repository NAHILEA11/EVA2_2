/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_if3;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA2_5_IF3 {

    public static void main(String[] args) {
        //TODO code application logic here
        //CAPTURAR TEMPERATURA
        int temp;
        Scanner captu = new Scanner (System.in);
        //CAPTURA TEMPERATURA
        System.out.println("Temperatura (c°):");
        temp = captu.nextInt();
        //VAMOS A EVALUAR
        //SI la temperatura es mayor a 22°, se enciende 
        //clima
        if (temp > 22)
            System.out.println("ENCEDER LE AIRE");
      
    }
}
