/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_19_for_2;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class Eva_19_For_2 {

    public static void main(String[] args) {
        //TODO code application logic here
        //PREGUNTAR: CANTIDAD DE ESTUDIANTES EN EL GRUPO
        int numAlum;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuantos estudiantes tiene el grupo");
        numAlum = captu.nextInt();
        //hay que capturar todas las calificaciones:
        //for (int i = 0; i < numAlum; i ++) {AMBOS FOR HACEN LO MISMO
        for (int i = 1; i <= numAlum; i++) {
            System.out.println("Calificaion: ");
            int califa = captu.nextInt();
        }
        
    }
}
