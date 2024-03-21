/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_calif_eeuu;

/**
 *
 * @author Nahilea
 */
public class EVA2_14_CALIF_EEUU {

    public static void main(String[] args) {
         //TDOO code application logic here
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la calificacion (0 - 100); ");
        califa = captu.nextInt();
        
        if (califa >=90 && califa <=100) //A
            System.out.println("A");
        else if(califa >=80 && califa <=89) //B
            System.out.println("B");
        else if(califa >=70 && califa <=79) //C
            System.out.println("C");
        else if(califa >=60 && califa <=69) //D
            System.out.println("D");
        else if(califa >=0 && califa <=59) //F
            System.out.println("F");
        
                  
        
    }
}