/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_9_pedro;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author farne
 */
public class PROJETO_9_PEDRO {

    public static void main(String[] args) {
    Scanner  ler = new Scanner(System.in);
    Random sorte = new Random();
    
    int carro=sorte.nextInt(10);int carro1=carro;
    int novos_C=0; int temp=0;
    int carro2=0;int carro3=0;int TC;
   
    for(int i=0;i<=3;++i){
        for(int j=0;j<600;++j){
            if(temp==80){
              temp=0;  
            }
        if(novos_C==15){
            novos_C=0;
            if(carro<10){
               carro += sorte.nextInt(10);
                         if(i == 1){
                            carro1 += carro;
                      }
                          else if(i==2){
                             carro2 += carro;
                    }
                          else{
                              carro3 += carro;
                          }
                 }
             }
        else if(temp<=30){
              System.out.println("Verde "+i);
                    while(carro > 0){
                        /*saida de carros*/
                        System.out.println("Carro sai no sinal "+i);
                        carro--;
                        temp++;
                    }
        }
          
                else if((temp > 30) && (temp <= 35)){
                    System.out.println("Amarelo"+i);
                }
                else{
                    System.out.println("Vermelho"+i);
                }
                novos_C++;
                temp++;
            }
    
        System.out.println("Sairam "+carro+" carros da primeira intersecao");
        System.out.println("Sairam "+carro2+" carros da segunda intersecao");
        System.out.println("Sairam "+carro3+" carros da terceira intersecao");
        }
    }
}

  


      


