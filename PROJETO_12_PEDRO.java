/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class PROJETO_12_PEDRO {
    static String nome_U;
    static String nome_D;
    static String nome_F;
    static String nome_F_D;
    static String dicas[]= new String [5];
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       JOGADOR_1(dicas);
       JOGADOR_D(dicas);
       
    }
    public static void JOGADOR_1(String[] args) {
         Scanner ler = new Scanner(System.in);
           
        System.out.println("Jogador numero um, informe seu nome");
        nome_U= ler.next();
        System.out.println(nome_U + ", informe o filme");
        nome_F= ler.next();
        for(int i = 0; i < 5 ;++ i ){
         System.out.println(nome_U + " informe a dica numero" + i+1);
         dicas[i]= ler.next();
        }
    }
    public static void JOGADOR_D(String[] args) {
         Scanner ler = new Scanner(System.in);
          
         
         System.out.println("Jogador numero Dois, informe seu nome");
        nome_D= ler.next();
        System.out.println("Seja bem-vindo " + nome_D);
        System.out.println("tente adivinhar os filmes");
        System.out.println("Essa sera a primeira dica");
         System.out.println(dicas[0]);
         System.out.println("Qual o nome do filme");
         nome_F_D= ler.next();
         for(int i = 0; i < 5 ; ++i){
       if(nome_F.equals(nome_F_D)){
           System.out.println("Voce acertou");
           break;
       }
       else{
           System.out.println("Vc errou");
           System.out.println(dicas[i+1]);
            nome_F_D= ler.next();
       }
         }
    }
}
