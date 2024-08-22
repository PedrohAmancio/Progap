/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcao;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Funcao {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int numero; boolean inicio = true;
       
       while(inicio){
       System.out.println("Digite o numero");
        numero = ler.nextInt();
        tabuada(numero);
       }
      
    }
     public static void tabuada(int numero){
    
         int res[] = new int [10];
         for(int i = 0; i < 10;++i){
             res[i]=i*numero;
              System.out.println(numero +" x " + i + "="+ res[i]);
              }
         
     }
}
