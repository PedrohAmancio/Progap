/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.try_catch_pratica_3;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Try_catch_pratica_3 {

    public static void main(String[] args) {
        int num[]= new int[4]; int indice;int indice2;
        Scanner ler = new Scanner(System.in);
       for(int i = 0 ; i < 3; ++i){ 
        System.out.println("Digite o numero para o vetor " + i);
        num[i] = ler.nextInt();
    }
       System.out.println("Quais indice deseja dividir(0-3)");
       indice=ler.nextInt();
       System.out.println("Por qual indice(0-3)");
       indice2=ler.nextInt();
       try{
           int result = num[indice]/num[indice2];
           System.out.println("Valor no indice " + indice + ":" + num[indice]);
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Erro: indice fora do intervalo");
       }catch(ArithmeticException e){
        System.out.println("Erro: divisão por zero");
   
    }
}
}