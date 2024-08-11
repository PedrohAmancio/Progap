/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_10_pedro;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author farne
 */
public class PROJETO_10_PEDRO {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       Random sorte = new Random();
       
       int tarefas=20;int funcionarios=5;
       int tempo=sorte.nextInt(8);int semana=0;
       int tempH=sorte.nextInt(8);int tempD=sorte.nextInt(7);
       int falha=0; int novo_T=0;
       
       for(int i=1;i<=5;i++){
          System.out.println("O funcionario "+i+" ficou com as "+4+" tarefas" +
                             "O tempo de conclusão é:"
                         +tempH*4+" horas "+tempD+(" Dias"));
          novo_T=tempH*4;
          tempH=sorte.nextInt(8);
          tempD=sorte.nextInt(7);
          }
        while(semana<=7){
          System.out.println("O funcionario"+ 1+1 +" teve uma redução de "+(novo_T-8));
          ++semana;
       }
      
    }
       
       
    }

