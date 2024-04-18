/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_25_break_cont;

/**
 *
 * @author Nahilea
 */
public class EVA2_25_BREAK_CONT {

    public static void main(String[] args) {
        //TODO code application logic here >
        
        for (int i = 0; i < 100; i++){
            int mod = i % 2;
            if(mod != 0)//queremos los casos que sean pares
                continue;//CUANDO SE EJECUTA, INTERRUMPE LA INTERACCION ACTUAL
            System.out.println(i);
            
            
        } 
          
        System.out.println("BREAK: >>>>>>>>>>>");
        for (int i = 0; i < 100; i++){
            System.out.println(i);
            if(i == 50)
                break;
        }
            
            
        }
    }

