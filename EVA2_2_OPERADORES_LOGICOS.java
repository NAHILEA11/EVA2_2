/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_operadores_logicos;

/**
 *
 * @author Nahilea
 */
public class EVA2_2_OPERADORES_LOGICOS {

    public static void main(String[] args) {
        //TODO code application logic here
        boolean A, B;
        A = false;
        B = false;
        boolean resu;
        //OPERADOR ANDA > &&
        resu = A && B;
        System.out.println("Resu = "+ resu);
        A = true;
        B = false;
        
        resu= A && B;
        System.out.println("Resu = " + resu);
        A = true;
        B = true;
        
        resu = A && B;
        System.out.println("Resu = " + resu);
        
        resu = A && B;
        System.out.println("Resu = " + resu);
        
        //OPERADOR OR
        A = false;
        B = false;
        resu = A || B;
        System.out.println("resu (or) = +  resu");
        A = true;
        B = false;
        
        resu = A || B;
        System.out.println("resu (or) = + resu");
        
        //NEGACION > !
        
        A = false;
        resu = !A;
        System.out.println("Resu (!) =" + resu);
        
    
        
       
        
        
    }
}
