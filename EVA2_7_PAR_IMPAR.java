/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class EVA2_7_PAR_IMPAR {

    public static void main(String[] args) {
        //TODO code application logic here
        int num, div, resi;
        Scanner captu = new Scanner (System.in);
        System.out.println("introduce un numero entero:");
        num = captu.nextInt();
        div = num / 2;
        System.out.println("Division entera de " + num + "/2 = " + div );
        num = captu.nextInt();
        resi = num % 2;
        System.out.println("El residuo de " + num + " % 2 = " + resi);
        //NUMERO PAR O IMPAR:
        if (resi == 1)
            System.out.println(num + "es impar"); // verdadero
        else
            System.out.println(num + "es par"); //falso
    }
       
    }

