/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA_2_12_SERVICIO_SOCIAL {

    public static void main(String[] args) {
        //TODE code application logic here
        int creditos, semestre;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Que semestre cursas?");
        semestre = captu.nextInt();
        System.out.println("¿Cuantos creditos llevas?");
        creditos = captu.nextInt();
        //INDICAR SI PUEDE O NO REALIZAR EL SERVICIO SOCIAL
        //IR EN 6TO SEMESTRE O SUPERIOR (semestre >=6)
        //TENER AL MENOS 150 CREDITOS (cr4editos >=150)
        if ((semestre >=6) && (creditos >=150))
            System.out.println("Puedes realizar el servicio social");
        else
            System.out.println("No puedes realizar el servicio social");
        
  
    }
}
