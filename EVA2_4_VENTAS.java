/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA2_4_VENTAS {

    public static void main(String[] args) {
        //TODO code application logic here
        int cantidad, calcSaldo;
        Scanner captu = new Scanner (System.in);
        System.out.println("¿Cuantas piezas quieres comprar");
        cantidad = captu.nextInt();
        
        if(cantidad > 1000)
            calcSaldo = cantidad * 500;
        else
            calcSaldo = cantidad *800;
        System.out.println("El saldo es " + calcSaldo);
    }
}
