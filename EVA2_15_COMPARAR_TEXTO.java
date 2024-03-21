///*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_15_comparar_texto;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA2_15_COMPARAR_TEXTO {

    public static void main(String[] args) {
        //TODO code application logic here
        //COMPARAR TEXTO EN JAVA
        String dia;
        int otroDia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el dia (lunes, martes,etc");
        dia = captu.nextLine();
        

        if(dia.equals("domingo"))//no podemos comparar cadenas con =
            System.out.println("1");
        else if(dia.equals("lunes"))
            System.out.println("2");
        else if(dia.equals("martes"))
            System.out.println("3");
        else if(dia.equals("miercoles"))
            System.out.println("4");
        else if(dia.equals("jueves"))
            System.out.println("5");
        else if(dia.equals("viernes"))
            System.out.println("6");
        
        
        
                    
        
    }
}
