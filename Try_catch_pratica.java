/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.try_catch_pratica;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Try_catch_pratica {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int num; int divi;
      
      System.out.println("Digite um numero");
    num = ler.nextInt();
        System.out.println("Digite um divisor");
    divi = ler.nextInt();
    try{
        int resultado = num/divi;
        System.out.println("Resultado: " + resultado);
    } catch(ArithmeticException e){
        System.out.println("Erro: divisão por zero");
   
    }
    }
}
