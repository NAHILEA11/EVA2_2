/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_volado;

/**
 *
 * @author Nahilea
 */
public class EVA2_8_VOLADO {

    public static void main(String[] args) {
        //TODO code application logic here
        //numero aleatorio en Java:
        //valores entre 0 y 1.
        //0.313534354354
        //0.635345454
        double moneda;
        moneda = Math.random();
        System.out.println("El valor de moneda = " + moneda);
         
        //0.5 es la mitad del rango 
        if (moneda > 0.5)
            System.out.println("CARA");
        else
            System.out.println("CRUZ");
    }
}
