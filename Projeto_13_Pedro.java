/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class Projeto_13_Pedro {
 public static int n=0;
 
    public static void main(String[] args) {
 
         int opr;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quantos nueros serao calculados");
        n=ler.nextInt();

        System.out.println("Qual operacao deseja (1-adicao, 2-subtracao" + 
        "3-multiplicacao ou 4-divisao)");
        opr=ler.nextInt();
        if(opr==1){
            
        }else if(opr==2){
            
        }else if(opr==3){
            
        }else if(opr==4){
         adição(ind);   
        }
        
        
    
    public static void adição(int opr) {
         Scanner ler = new Scanner(System.in);
         
        int []op = new int [n] ; int res;int ind;
        
       for(int i = 0; i < n ; ++i){
        System.out.println("Digite o  numero a ser calculado");
        op[i]=ler.nextInt();
       }
       
        for(int i = 0; i < n ; ++i){
        System.out.println("Esses são os numeros dentro do vetor" + i);
                System.out.println(op[i]);
           
        }
        System.out.println("Quais serao somados (Digite o indice");
        ind = ler.nextInt();
        
        try{
            System.out.println("Valor no indice"+ ind+":"+ op[ind]);
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Erro: indice fora do intervalo");
    }
        }
        
        
       }
       
    public static void subtração(String[] args) {
        System.out.println("Hello World!");
    }
    public static void divisão(String[] args) {
        System.out.println("Hello World!");
    }
    public static void multiplicação(String[] args) {
        System.out.println("Hello World!");
    }
}

