/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Matriz {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome [][] = new String[2][4];
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
            System.out.println("Digte um nome");
            nome[i][j]= ler.next();
        }
       }
       for(int i = 0; i < 2; i++){
           for(int j = 0; j < 4; j++){
               System.out.println("linha- " + i + " coluna - " + j + "- "+ nome[i][j]); 
           }
       }
        
    }
}
